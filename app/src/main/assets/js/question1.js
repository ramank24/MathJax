
var app = angular.module("embibeApp", []);
app.controller("appCtrl", function($scope,$window) {

    console.log("From JS Controller");

    $window.setActive = function(active) {
        document.title = active;
    }

    $window.setData = function(json, isAttemptAllowed=true)
    {
        $window.scrollTo(0,0);
        console.log("From JS", json);
        console.log(json);
        console.log(isAttemptAllowed);
        $scope.jsonData = json;
        $scope.isAttemptAllowed = isAttemptAllowed;

        if(!$scope.$$phase)
        {
            $scope.$apply();
        }

        setTimeout(function () {
            MathJax.Hub.Queue(["Typeset", MathJax.Hub]);
        });
    }
})

 app.directive("mathjaxBind", function() {
        return {
            restrict: "A",
            scope: {
                text: "@mathjaxBind"
            },
            controller: ["$scope", "$element", "$attrs", function($scope, $element, $attrs) {
                $scope.$watch('text', function(value) {
                    var $script = angular.element("<script type='math/tex; mode=" + ($attrs.mathjaxMode == undefined ? "inline" : $attrs.mathjaxMode) + "'>")
                        .html(value == undefined ? "" : value);
                    $element.html("");
                    $element.append($script);
                    MathJax.Hub.Queue(["Reprocess", MathJax.Hub, $element[0]]);
                });
            }]

        };
    })

app.directive('dynamicData', function($compile) {
    return {
        restrict: 'A',
        replace: true,
        link: function(scope, ele, attrs) {
              scope.$watch(attrs.dynamicData,
                function(html) {
                    console.log("DynamicData", html);
                    if(html != undefined)
                    {
                     html = html.replace(/\{/g, " \{");
                     html = html.replace(/\{/g, " \{");
                     html = html.replace(/\{\{/g, " \{ \{");
                     html = html.replace(/\}\}/g, " \} \}");
                     html = html.replace(/\$\$([^$]+)\$\$/g, "<span mathjax-bind=\"$1\"></span>");
                     html = html.replace(/\$([^$]+)\$/g, "<span mathjax-bind=\"$1\"></span>");
                     html = html.replace(/\{\{/g, " \{ \{");
                     // html = html.replace(/\�*/g, "");
                     ele.html(html);
                     $compile(ele.contents())(scope);
                    } 
                });
        }
    };
});
