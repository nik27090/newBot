require: slotfilling/slotFilling.sc
  module = sys.zb-common
  
patterns:
    $testPatternOptElements = [мой] [дядя] [самых] [честных] [правил]
    $testPatternOptElements2 = [когда] [не в шутку] [занемог]
    $testSomeTestWord = какоетотестворд
    
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /привет
        a: Привет привет

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: 

    state: TestPatternsWithOptionalElementInside
        q!: testTwoPatternsWithOptElemNothingBetween [$testPatternOptElements] [$testPatternOptElements2]
        q!: testTwoPatternsWithOptElemAndOptElem [$testPatternOptElements] [$testSomeTestWord] [$testPatternOptElements2]
        q!: testTwoPatternsWithOptElemAndElement [$testPatternOptElements] anyPatternOrElement [$testPatternOptElements2]
        q!: testTwoPatternsWithOptElemAndPattern [$testPatternOptElements] $testSomeTestWord [$testPatternOptElements2]
        q!: testOnePatternWithOptElemAndOptElem [$testSomeTestWord] [$testPatternOptElements]
        q!: testOnePatternWithOptElemAndElement anyPatternOrElement [$testPatternOptElements]
        q!: testOnePatternWithOptElemAndPattern $testSomeTestWord [$testPatternOptElements]
        script: 
            log("////ParseTree      " + toPrettyString($parseTree))
