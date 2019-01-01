/* Algorithm to find the items that are not present from both arrays and display them*/

function diffArray(arr1, arr2) {
  var newArr = [];
    
    // If arr2 does not include specific element from arr1, push to new array
    for(var i = 0; i < arr1.length; i++){
      if (!(arr2.includes(arr1[i]))){
        newArr.push(arr1[i]);
      }
    }

    // If arr1 does not include specific elemnt from arr2, push to new array
    for(var i = 0; i < arr2.length; i++){
      if (!(arr1.includes(arr2[i]))){
        newArr.push(arr2[i]);
      }
    }
  
  return newArr;
  }
  

diffArray([1, "calf", 3, "piglet"], [1, "calf", 3, 4]);