
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Quizyy | Finomena</title>

            <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" type="text/css" href="/assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="/assets/css/materialize.css">
        <link rel="stylesheet" type="text/css" href="/assets/css/style.css">

        <link href="https://fonts.googleapis.com/css?family=Lato:300" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="/assets/css/jquery.easy-pie-chart.css">

            <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">



        <meta name="theme-color" content="#000000">

        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
    <body>

        <div class="sectionOne" style="display:flex; justify-content:center; align-items:center;">
            <div id="welcomeDiv">
                <h2 style="color: #fff; display: inline-block; font-weight: bold">Quizyy!</h2><img src="/assets/img/nerd.svg" style="display: inline-block; margin-top: -24px" width="56px">
                <h4 class="typist" style="color: #2ec866; margin-top :-9px"><font color="#fff">Come and </font></h4>

                <br>
                <center>
                    <a onclick="showNamePopup()" class="waves-effect waves-light green lighten-1 btn"><font style="color: #fff; font-weight: bold">Play</font></a>
                </center>
            </div>

            <div id="quizDiv" style="display: none;">
                <h3 id="welcomeMsg" style="color: #fff;"></h3   >
                <center>
                    <div class="materialDot"></div>
                </center>
                <br>

                <div id="quesOne">
                    <h5>What is the capital city of Karnataka?</h5>
                    <div class="optionDiv">
                        <div value="1" id="a1_1" class="options waves-effect waves-green" onclick="checkQuesOne(1)"><div class="optionBody">Delhi</div></div>
                        <div value="2" id="a1_2" class="options waves-effect waves-green" onclick="checkQuesOne(2)"><div class="optionBody">Bengaluru</div></div>
                        <div value="3" id="a1_3" class="options waves-effect waves-green" onclick="checkQuesOne(3)"><div class="optionBody">Mumbai</div></div>
                    </div>
                </div>

                <div id="quesTwo" class="ques">
                    <h5>Which medal did PV Sindhu win in Rio Olympics 2016?</h5>
                    <div class="optionDiv">
                        <div value="1" id="a2_1" class="options waves-effect waves-green" onclick="checkQuesTwo(1)"><div class="optionBody">Gold</div></div>
                        <div value="2" id="a2_2" class="options waves-effect waves-green" onclick="checkQuesTwo(2)"><div class="optionBody">Silver</div></div>
                        <div value="3" id="a2_3" class="options waves-effect waves-green" onclick="checkQuesTwo(3)"><div class="optionBody">Bronze</div></div>
                    </div>
                </div>

                <div id="quesThree" class="ques">
                    <h5>Who is Abhinav Bindra?</h5>
                    <div class="optionDiv">
                        <div value="1" id="a3_1" class="options waves-effect waves-green" onclick="checkQuesThree(1)"><div class="optionBody">Swimmer</div></div>
                        <div value="2" id="a3_2" class="options waves-effect waves-green" onclick="checkQuesThree(2)"><div class="optionBody">Shooter</div></div>
                        <div value="3" id="a3_3" class="options waves-effect waves-green" onclick="checkQuesThree(3)"><div class="optionBody">Cricketer</div></div>
                    </div>
                </div>

                <div id="quesFour" class="ques">
                    <h5>Who is the captain of RCB?</h5>
                    <div class="optionDiv">
                        <div value="1" id="a4_1" class="options waves-effect waves-green" onclick="checkQuesFour(1)"><div class="optionBody">AB</div></div>
                        <div value="2" id="a4_2" class="options waves-effect waves-green" onclick="checkQuesFour(2)"><div class="optionBody">Virat Kohli</div></div>
                        <div value="3" id="a4_3" class="options waves-effect waves-green" onclick="checkQuesFour(3)"><div class="optionBody">Chris Gayle</div></div>
                    </div>
                </div>

                <div id="quesFive" class="ques">
                    <h5>What is the capital city of Tamil Nadu?</h5>
                    <div class="optionDiv">
                        <div value="1" id="a5_1" class="options waves-effect waves-green" onclick="checkQuesFive(1)"><div class="optionBody">Chennai</div></div>
                        <div value="2" id="a5_2" class="options waves-effect waves-green" onclick="checkQuesFive(2)"><div class="optionBody">Bengaluru</div></div>
                        <div value="3" id="a5_3" class="options waves-effect waves-green" onclick="checkQuesFive(3)"><div class="optionBody">Hyderabad</div></div>
                    </div>
                </div>
            </div>

            <div id="resultDiv">
                <h3 id="welcomeMsg" style="color: #fff;">Cheers!</h3>
                <center>
                    <div class="materialDot"></div><br>
                </center>
                <center>
                    <h6 class="correct" id="finalScore"></h6>
                </center>

                <div class="row" style="padding:0; margin: 0;">
                    <div class="input-field col s12 l12">
                        <div class="row">
                            <div class="input-field col s2 l2" style="margin: 0">
                                <h6>Q#</h5>
                            </div>

                            <div class="input-field col s5 l5" style="margin: 0">
                                <h6>Your Answer</h5>
                            </div>

                            <div class="input-field col s5 l5" style="margin: 0">
                                <h6>Correct Answer</h5>
                            </div>
                        </div>
                        <hr style="margin: 0 0 8px 0;">
                        <div class="row">
                            <div class="input-field col s2 l2" style="margin: 0">
                                <h6 style="padding: 2px;">1</h6>
                                <h6 style="padding: 2px;">2</h6>
                                <h6 style="padding: 2px;">3</h6>
                                <h6 style="padding: 2px;">4</h6>
                                <h6 style="padding: 2px;">5</h6>
                            </div>

                            <div class="input-field col s5 l5" style="margin: 0">
                                <h6 id="userAnsOne"></h6>
                                <h6 id="userAnsTwo"></h6>
                                <h6 id="userAnsThree"></h6>
                                <h6 id="userAnsFour"></h6>
                                <h6 id="userAnsFive"></h6>
                            </div>

                            <div class="input-field col s5 l5" style="margin: 0">
                                <h6 style="padding: 2px;" id="oneAns"></h6>
                                <h6 style="padding: 2px;" id="twoAns"></h6>
                                <h6 style="padding: 2px;" id="threeAns"></h6>
                                <h6 style="padding: 2px;" id="fourAns"></h6>
                                <h6 style="padding: 2px;" id="fiveAns"></h6>
                            </div>

                        </div>
                    </div>
                    <div class="input-field col s12 l12 container" style="padding:0; margin: 0;">
                        <center>
                            <h6>Pie Chart!</h6>
                            <div class="chart" id="pieChart"></div>
                        </center>
                    </div>
                </div>
            </div>

            <div class="footerDiv valign-wrapper">
                <div style="width: 100%; text-align: center" class="container">
                    <center>Made with <img src="/assets/img/heart.svg" width="16px" style="margin: 3px; margin-top: -1px"> by Adarsh Raj Shah</center>
                </div>
            </div>
        </div>


            <!-- Modal Structure -->
        <div id="nameModal" class="modal customModal">
            <div class="nameModalBody container">
                <center>
                    <img src="/assets/img/nerd.svg" width="72px" style="display: block">
                    <h5 style="color: #fff">Hey there! Welcome to Quizyy!</h5>
                    <input id="userName" type="text" class="validate" style="margin-top: 24px; color: #fff" placeholder="What's your name?">
                    <a onclick="startQuiz()" class="waves-effect waves-light green lighten-1 btn "><font style="color: #fff">Dive In!</font></a>
                </center>

            </div>
        </div>

    </body>
    <script type="text/javascript" src="/assets/js/jquery-1.12.4.js"></script>
    <script type="text/javascript" src="/assets/js/easypiechart.js"></script>
    <script type="text/javascript" src="/assets/js/materialize.js"></script>
    <script type="text/javascript" src="/assets/js/myJs.js"></script>
    <script type="text/javascript" src="/assets/js/typist.js"></script>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Oct 08 09:18:35 IST 2016
                  SOURCE: /home/dodo/project/quizyy/app/views/main.scala.html
                  HASH: dcd5b752c95be9285a9fa2a4a5333ce2cde790b3
                  MATRIX: 825->0
                  LINES: 32->1
                  -- GENERATED --
              */
          