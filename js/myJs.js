/**
 * Created by dodo on 7/10/16.
 */

var userName;
var userAnswerOne;
var userAnswerTwo;
var userAnswerThree;
var userAnswerFour;
var userAnswerFive;

var answerOne = 2;
var answerTwo = 2;
var answerThree = 2;
var answerFour = 2;
var answerFive = 1;

///modal
$(document).ready(function(){
    $('select').material_select();
    $(".button-collapse").sideNav();
    $('.modal-trigger').leanModal();

    $('.typist')
        .typist({
            text: 'play!'
        })
        .typistPause(1000)
        .typistRemove(5)
        .typistPause(500)
        .typistAdd('win!')
        .typistPause(1000)
        .typistRemove(4)
        .typistPause(500)
        .typistAdd('enjoy! :D')
        .typistStop();
});

function showNamePopup(){
    $("#userName").val("");
    $("#nameModal").openModal();
}

function startQuiz(){
    userName = $("#userName").val();
    console.log(userName);
    if(userName == ""){
        notifyError("Please Enter your name!");
    } else{
        $("#welcomeMsg").html("Welcome to Quizyy! " +  $("#userName").val());
        $("#userName").val("");
        $("#nameModal").closeModal();
        $("#welcomeDiv").hide();
        $("#quizDiv").fadeIn();
    }
}

function notifyError(msg){
    Materialize.toast(msg, 3000, 'rounded');
}

//ques 1
$("input:radio[name='questionOneOption']").click(function(){
    userAnswerOne = this.value;
    $("#quesOne").hide();
    $("#quesTwo").fadeIn();
})

//ques 2
$("input:radio[name='questionTwoOption']").click(function(){
    userAnswerTwo = this.value;
    $("#quesTwo").hide();
    $("#quesThree").fadeIn();        
})

//ques 3
$("input:radio[name='questionThreeOption']").click(function(){
    userAnswerThree = this.value;
    $("#quesThree").hide();
    $("#quesFour").fadeIn();
})

//ques 4
$("input:radio[name='questionFourOption']").click(function(){
    userAnswerFour = this.value;
    $("#quesFour").hide();
    $("#quesFive").fadeIn();
})

//ques 5
$("input:radio[name='questionFiveOption']").click(function(){
    userAnswerFive = this.value;
    $("#quizDiv").hide();
    $("#resultDiv").fadeIn();

    computerGraph();
})

function computerGraph() {
    var correctCount = 0;
    if(userAnswerOne == answerOne){
        correctCount ++;
        $("#userAnsOne").addClass("correct");
    } else{
        $("#userAnsOne").addClass("incorrect");
    }
    if(userAnswerTwo == answerTwo){
        correctCount ++;
        $("#userAnsTwo").addClass("correct");
    } else{
        $("#userAnsTwo").addClass("incorrect");
    }
    if(userAnswerThree == answerThree){
        correctCount ++;
        $("#userAnsThree").addClass("correct");
    } else{
        $("#userAnsThree").addClass("incorrect");
    }
    if(userAnswerFour == answerFour){
        correctCount ++;
        $("#userAnsFour").addClass("correct");
    } else{
        $("#userAnsFour").addClass("incorrect");
    }
    if(userAnswerFive == answerFive){
        correctCount ++;
        $("#userAnsFive").addClass("correct");
    } else{
        $("#userAnsFive").addClass("incorrect");
    }

    $("#finalScore").html("Final Score: " + correctCount + "/5");


    $("#userAnsOne").html($("#a1_" + userAnswerOne).attr("answer"));
    $("#userAnsTwo").html($("#a2_" + userAnswerTwo).attr("answer"));
    $("#userAnsThree").html($("#a3_" + userAnswerThree).attr("answer"));
    $("#userAnsFour").html($("#a4_" + userAnswerFour).attr("answer"));
    $("#userAnsFive").html($("#a5_" + userAnswerFive).attr("answer"));


}