// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.15;

contract Human{
    string private name="Alex";
    uint private age=16;

    function getName() public view returns (string memory){
        return name;
    }
    function setName(string memory newName) public {
        name = newName;
    }
    function getAge() public view returns (uint){
        return age;
    }
    function setAge(uint newAge) public {
        age = newAge;
    }
}