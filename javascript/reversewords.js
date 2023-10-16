function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');

    const reversedWords = words.map(word => {
        
        return word.split('').reverse().join('');
    });

   
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence)
