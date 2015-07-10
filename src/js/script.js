"use strict";
console.log("start");

Array.prototype.ipush = function (el) {
    const that = this.slice();
    that.push(el);
    return that;
}

function backtrack(partial, set) {        		
    if (is_a_solution(partial, set)) {
        return process_solution(partial, set);			
    }
    
    return construct_candidates(partial, set).reduce(function (solutions, candidate) {
        return solutions.concat(backtrack(partial.ipush(candidate), set));
    }, []);
}

function is_a_solution(partial, set) {
    return partial.length === set.length;
}

function construct_candidates(partial, set) {
    return set.filter(function (element) {
        return (partial.indexOf(element) === -1);        
    });
}

function process_solution(solution, set) {
//     console.log(solution);
    return [solution];
}

const solutions = backtrack([], ["A", "B", "C", "D"]);
solutions.forEach(function (solution) {
    console.log(solution);    
});
console.log("end");