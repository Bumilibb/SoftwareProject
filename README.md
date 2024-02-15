# HW-1

Setting up Github 
![System Diagram](https://github.com/Ariel6789/HW-1/blob/main/IMG_1646.jpeg?raw=true)
![System Diagram1](image.png)

EXAMPLE INPUT 
{
    inputType: "json", //indicates the format of the input, JSON
    data: "{\"number\": 30}", //contains the actual data tobe processed
    outputType: "json", // specifies how the output should be formatted
    outputData: "" // initially empty, as it will be filled  with the result of the computation
}

EXAMPLE OUTPUT
{
    outputType: json,
    data: {
        number: 30,
        primeFactors: [2, 3, 5],
        divisors: [1, 2, 3, 5, 6, 10, 15, 30],
        visualization: "image",
    }
}
