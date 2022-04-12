package com.example.mathjax

val gConfig = "MathJax.Hub.Config({" +
        "showMathMenu: false," +
        "extensions: [\"tex2jax.js\"]," +
        "jax: [\"input/TeX\", \"output/HTML-CSS\"]," +
        "messageStyle: \"none\"," +
        "tex2jax: { inlineMath: [[\"\\(\",\"\\)\"]] }," +
        "tex2jax: {preview: \"none\"," +
        "inlineMath: [ [\"\\(\",\"\\)\"] ]," +
        "displayMath: [ ['$$','$$'], [\"\\[\",\"\\]\"] ]," +
        "processEscapes: true}," +
        "\"HTML-CSS\": { linebreaks: { automatic: true, width: \"container\" },availableFonts: [\"TeX\"],mtextFontInherit: true }," +
        "CommonHTML: { linebreaks: { automatic: true } }" +
        "});"
val gPreDefinedConfig = "MMLorHTML"
val sampleJson = arrayOf(Question(1217355,"EM0318288","en",1,"Single Choice",
    "Test",
    "A ball is dropped from the apex of a tower so that distance travelled during the last second " +
            "of its fall is half the height of the tower. The time of free fall is",
    arrayOf(Answer(false, "<math><mn>2</mn><mo>+</mo><msqrt><mn>2</mn></msqrt><mi> </mi><mi>s</mi></math>", "", 1, ""),
        Answer(false, "<math><mn>2</mn><mo>-</mo><msqrt><mn>2</mn></msqrt><mi> </mi><mi>s</mi></math>", "", 1, ""),
        Answer(false, "<math><mn>2</mn><mo>-</mo><msqrt><mn>3</mn></msqrt><mi> </mi><mi>s</mi></math>", "", 1, ""),
        Answer(false, "<math><mn>1</mn><mo>-</mo><msqrt><mn>6</mn></msqrt><mi> </mi><mi>s</mi></math>", "", 1, "")),

    3,75,4,-1,
    emptyArray(), emptyArray(),"","null","Motion in One Dimension"),

    Question(1217355,"EM0318288","en",1,"Single Choice",
        "Test",
        "A particle is projected from the ground with the speed  <math><mn>35</mn><mi> </mi><mi>m</mi><msup><mrow><mi>s</mi></mrow><mrow><mo>–</mo><mn>1</mn></mrow></msup></math>  at angle of  <math><msup><mrow><mn>53</mn></mrow><mrow><mi>o</mi></mrow></msup></math> with the vertical. The minimum speed of particle during its motion will be",
        arrayOf(Answer(false, "<math><mn>21</mn><mi> </mi><mi>m</mi><msup><mrow><mi>s</mi></mrow><mrow><mo>–</mo><mn>1</mn></mrow></msup></math>", "", 1, ""),
            Answer(false, "<math><mn>28</mn><mi> </mi><mi>m</mi><msup><mrow><mi>s</mi></mrow><mrow><mo>–</mo><mn>1</mn></mrow></msup></math>", "", 1, ""),
            Answer(false, "<math><mn>28</mn><mi> </mi><mi>m</mi><msup><mrow><mi>s</mi></mrow><mrow><mo>–</mo><mn>1</mn></mrow></msup></math>", "", 1, ""),
            Answer(false, "<math><mn>28</mn><mi> </mi><mi>m</mi><msup><mrow><mi>s</mi></mrow><mrow><mo>–</mo><mn>1</mn></mrow></msup></math>", "", 1, "")),

        3,75,4,-1,
        emptyArray(), emptyArray(),"","null","Motion in One Dimension"),

    Question(1217355,"EM0318288","en",1,"Single Choice",
        "Test",
        "A ball is dropped from the apex of a tower so that distance travelled during the last second " +
                "of its fall is half the height of the tower. The time of free fall is",
        arrayOf(Answer(false, "Option B", "", 1, ""),
            Answer(false, "Option C", "", 1, ""),
            Answer(false, "Option C", "", 1, ""),
            Answer(false, "Option D", "", 1, "")),

        3,75,4,-1,
        emptyArray(), emptyArray(),"","null","Motion in One Dimension"),

    Question(1217355,"EM0318288","en",1,"Single Choice",
        "Test",
        "A ball is dropped from the apex of a tower so that distance travelled during the last second " +
                "of its fall is half the height of the tower. The time of free fall is",
        arrayOf(Answer(false, "Option B", "", 1, ""),
            Answer(false, "Option C", "", 1, ""),
            Answer(false, "Option C", "", 1, ""),
            Answer(false, "Option D", "", 1, "")),

        3,75,4,-1,
        emptyArray(), emptyArray(),"","null","Motion in One Dimension"),

    Question(1217355,"EM0318288","en",1,"Single Choice",
        "Test",
        "A ball is dropped from the apex of a tower so that distance travelled during the last second " +
                "of its fall is half the height of the tower. The time of free fall is",
        arrayOf(Answer(false, "Option B", "", 1, ""),
            Answer(false, "Option C", "", 1, ""),
            Answer(false, "Option C", "", 1, ""),
            Answer(false, "Option D", "", 1, "")),

        3,75,4,-1,
        emptyArray(), emptyArray(),"","null","Motion in One Dimension"),

    )

val sampleText = "<math xmlns=\"http://www.w3.org/1998/Math/MathML\" display=\"inline\"><mrow><mfrac><mrow><mn>3</mn></mrow><mrow><mn>5</mn></mrow></mfrac></mrow></math>"
var data =  "<html><head>" +
        "<style>" +
        "body {" +
        "    text-align: center;" +
        "}" +
        "</style>" +
        "<script type=\"text/x-mathjax-config\">" +
        gConfig +
        "</script>" +
        "<script type=\"text/javascript\" async src=\"file:///android_asset/MathJax/MathJax.js?config=" + gPreDefinedConfig + "\"></script>" +
        "</head>" +
        "<body>" +
        sampleText +
        "</body>" +
        "</html>"

val data1 =  "<html><head>" +
        " <meta name=\"viewport\" content=\"width=device-width, user-scalable=yes\" />" +
        "</head>" +
        "" +
        "<body style=\"font-size:18px\" >" +
        "<b>" + sampleText + "</br> " +
        "<script type=\"text/x-mathjax-config\">" +
        "  MathJax.Hub.Config({\n" +
        "  CommonHTML: { linebreaks: { automatic: true },EqnChunk:(MathJax.Hub.Browser.isMobile?10:50) },displayAlign: \"left\",\n" +
        "  \"HTML-CSS\": { linebreaks: { automatic: true } ," +
        "\n" +
        "    preferredFont: \"STIX\"}," +
        "extensions: [\"tex2jax.js\"],messageStyle:\"none\"," +
        "jax: [\"input/TeX\", \"input/MathML\",\"output/HTML-CSS\"]," +
        "tex2jax: {inlineMath: [['$','$'],['\\\\(','\\\\)']]}" +
        "});" +
        "</script>" +
        "<script type=\"text/javascript\" async src=\"file:///android_asset/MathJax/MathJax.js?config=MMLorHTML\"></script>" +
        "" +
        "</body>" +
        "</html>"
