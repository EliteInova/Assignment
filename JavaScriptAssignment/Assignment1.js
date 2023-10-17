// Take a sentence as an input and reverse every word in that sentence.
// Example - This is a sunny day > shiT si a ynnus yad.

const inputSentence = "This is a sunny day";
const reversed = reverse(inputSentence);
console.log(reversed);

function reverse(sentence) {
    const word = sentence.split(' ');
    const reversedword = word.map(word => {
        return word.split('').reverse().join('');
    });
    const reversedSentence = reversedword.join(' ');

    return reversedSentence;
}