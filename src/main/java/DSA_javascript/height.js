var heightChecker = function(heights) {
    var expected = [];
    for (let i = 0; i < heights.length; i++) {
        expected[i] = heights[i];
    }
    expected.sort((a, b) => a - b); // Added compare function for numeric sort
    var count = 0;
    for (let i = 0; i < expected.length; i++) {
        if (expected[i] != heights[i]) {
            count++;
        }
    }
    return count;
};


var heights = [1, 1, 4, 2, 1, 3];
console.log(heightChecker(heights));
