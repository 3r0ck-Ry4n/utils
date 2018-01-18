# utils
Useful tools to help accomplish day-to-day tasks

This repository contains a java class called "TextCase.java" which contains the conversion methods used in other classes, as well as three (as of 1/18/2018) classes containing main methods which are used to run different types of text case conversions.

I chose to separate each type of case conversion implementation in its own class with a main method so that each instance can be run independently. Theses classes were designed to run in the background and without any user input (other than copying something to the clip-board and running the desired class to perform the text case conversion).  

Personally, I like to have a shortcut set up for each of the implementation classes (run as an exe) and then create keyboard short-cuts to be able to quickly use them.  For instance, I have installed all three implementations as separate java exe apps on my desktop and have different keyboard shortcuts for each.  So when I need to use one of them, I simply copy a line of text to my system clipboard (CTRL + C), press the key combination for the desired shortcut (e.g. CTRL + ALT + U for converting everything to uppercase), and then I can paste the case-converted text where I need it.  Quick and easy.

Currently the three implementable classes are:
    - Upper --> CONVERTS ALL TEXT IN CLIPBOARD TO UPPERCASE; name = "TextCaseImplementation_Upper.java"
    - Lower --> converts all text in clipboard to lowercase; name = "TextCaseImplementation_Lower.java"
    - Title --> Converts All Text In Clipboard To Title Case; name = "TextCaseImplementation_Title.java"
  
  In future updates, I plan to have additional classes for:
    - CamelCase --> ConvertsAllTextInClipboardToCamelCase (with implementations for including spaces between each word and without)
    - Sentence  --> Converts all text in clipboard so that only the first letter in the first word of every sentence is capitalized.
    - Proper    --> Similar to the above "sentence" case conversion with the addition of recognizing proper nouns and capitalizing those appropriately (this will probably take me some time as I will wither have to include some sort of machine learning, or else store a large library of commonly used proper nouns)
