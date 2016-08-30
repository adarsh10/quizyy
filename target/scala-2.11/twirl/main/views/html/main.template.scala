
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


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>Pikarto - Like - Love - Share</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <meta property="og:title" content="">
    <meta property="og:type" content="website">
    <meta property="og:url" content="">
    <meta property="og:site_name" content="">
    <meta property="og:description" content="">

        <!-- Styles -->
    <link rel="stylesheet" href="/assets/css/font-awesome.min.css">
    <link rel="stylesheet" href="/assets/css/animate.css">
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100,200,300,500,600,700,800,900|Montserrat:400,700' rel='stylesheet' type='text/css'>


    <link rel="stylesheet" href="/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assets/css/main.css">

    <script src="/assets/js/modernizr-2.7.1.js"></script>

</head>

    <body>


        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="logo" href="index.html"><img src="/assets/img/logo.svg" alt="Logo"></a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
          </ul>
                </div><!--/.navbar-collapse -->
            </div>
        </div>

        <header>
            <div class="container">
                <div class="row">
                    <div class="col-xs-6">
                        <a href="index.html"><img src="/assets/img/logo.svg" alt="Logo"></a>
                    </div>
                    <div class="col-xs-6 signin text-right navbar-nav">
                        <a href="#pricing" class="scroll"></a>&nbsp; &nbsp;<a href="#"></a>
                    </div>
                </div>

                <div class="row header-info">
                    <div class="col-sm-10 col-sm-offset-1 text-center">
                        <h1 class="wow fadeIn">Like, Love, Share</h1>
                        <br>
                        <p class="lead wow fadeIn" data-wow-delay="0.5s">Good design is making something intelligible and memorable. Great design is making something memorable and meaningful</p>
                        <br>

                        <div class="row">
                            <div class="col-md-8 col-md-offset-2 col-sm-10 col-sm-offset-1">
                                <div class="row">
                                    <div class="col-xs-6 text-right wow fadeInUp" data-wow-delay="1s">
                                        <a href="#be-the-first" class="btn btn-secondary btn-lg scroll">About Pikarto</a>
                                    </div>
                                    <div class="col-xs-6 text-left wow fadeInUp" data-wow-delay="1.4s">
                                        <a href="#invite" class="btn btn-primary btn-lg scroll">Request Invite</a>
                                    </div>
                                </div><!--End Button Row-->
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </header>

        <div class="mouse-icon hidden-xs">
            <div class="scroll"></div>
        </div>

        <section id="be-the-first" class="pad-xl">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text-center margin-30 wow fadeIn" data-wow-delay="0.6s">
                        <h2>We respect Designs</h2>
                        <p class="lead">Share your original designs and let others like and review it!</p>
                    </div>
                </div>

                <div class="iphone wow fadeInUp" data-wow-delay="1s">
                    <img src="/assets/img/iphone.png">
                </div>
            </div>
        </section>

        <section id="main-info" class="pad-xl">
            <div class="container">
                <div class="row">
                    <div class="col-sm-4 wow fadeIn" data-wow-delay="0.4s">
                        <hr class="line purple">
                        <h3>Upload</h3>
                        <p>Upload images of your design, painting, murals or any kind of artworks at Pikarto, which you want to show to the world!</p>
                    </div>
                    <div class="col-sm-4 wow fadeIn" data-wow-delay="0.8s">
                        <hr class="line blue">
                        <h3>Share your Master Piece</h3>
                        <p>Showcare your talent and creativity among your friends, family and peer group easily via Facebook. </p>
                    </div>
                    <div class="col-sm-4 wow fadeIn" data-wow-delay="1.2s">
                        <hr  class="line yellow">
                        <h3>Connect</h3>
                        <p>Necer resteict.Conect with people from arpomf the world who are art lovers. Let them comment on ypur master piece :)</p>
                    </div>

                </div>
            </div>
        </section>


            <!--Pricing-->
        <section id="pricing" class="pad-lg">
            <div class="container">
                <div class="row margin-40">
                    <div class="col-sm-8 col-sm-offset-2 text-center">
                        <h2 class="white">Pikarto - The Magic Box!</h2>
                        <p class="white">World within your pocket. Pikarto is a app based platform. Small and simple just made for you</p>
                    </div>
                </div>

                <div class="row margin-50">

                    <div class="col-sm-4 pricing-container wow fadeInUp" data-wow-delay="1s" style="padding: 82px">
                        <br />
                        <ul class="list-unstyled pricing-table text-center">
                            <div class="iphone wow fadeInUp" data-wow-delay="1s">
                                <img src="/assets/img/phone2.png">
                            </div>
                        </ul>
                    </div>

                    <div class="col-sm-4 pricing-container wow fadeInUp" data-wow-delay="1s" style="padding: 56px">
                        <br />
                        <ul class="list-unstyled pricing-table text-center">
                            <div class="iphone wow fadeInUp" data-wow-delay="1s">
                                <img src="/assets/img/phone2.png">
                            </div>
                        </ul>
                    </div>

                    <div class="col-sm-4 pricing-container wow fadeInUp" data-wow-delay="1s" style="padding: 82px">
                        <br />
                        <ul class="list-unstyled pricing-table text-center">
                            <div class="iphone wow fadeInUp" data-wow-delay="1s">
                                <img src="/assets/img/phone2.png">
                            </div>
                        </ul>
                    </div>
                </div>

            </div>
        </section>


        <section id="invite" class="pad-lg light-gray-bg">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2 text-center">
                        <img src="/assets/img/play.png">
                        <h2 class="black">Coming Soon on Google Play!</h2>
                        <br />
                        <p class="black">Be among the first users to explore the awesomeness. Get notified</p>
                        <br />

                        <div class="row">
                            <div class="col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                                <form role="form">
                                    <div class="form-group">
                                        <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Email">
                                    </div>
                                    <button type="submit" class="btn btn-primary btn-lg">Request Notification</button>
                                </form>
                            </div>
                        </div><!--End Form row-->

                    </div>
                </div>
            </div>
        </section>

        <footer>
            <div class="container">

                <div class="row">
                    <div class="col-sm-8 margin-20">
                        <ul class="list-inline social">
                            <li>Connect with us on</li>
                            <li><a href="#"><img src="/assets/img/fb.png"></a></li>
                            <li><a href="#"><img src="/assets/img/insta.png"></a></li>
                        </ul>
                    </div>

                    <div class="col-sm-4 text-right">
                        <small>Designed with </small><img src="/assets/img/heart.png" style="padding: 2px">
                        <p><small>Pikarto 2016. Bengaluru, India.</small></p> <br>

                    </div>
                </div>

            </div>
        </footer>


            <!-- Javascript -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="/assets/js/jquery-1.11.0.min.js"><\/script>')</script>
        <script src="/assets/js/wow.min.js"></script>
        <script src="/assets/js/bootstrap.min.js"></script>
        <script src="/assets/js/main.js"></script>


    </body>
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
                  DATE: Tue Aug 30 16:19:24 IST 2016
                  SOURCE: /home/adarsh/Documents/pp/pixserver/app/views/main.scala.html
                  HASH: 74e7ec35b788dddd3a69b62f4c68eadc42bd8042
                  MATRIX: 825->1
                  LINES: 32->2
                  -- GENERATED --
              */
          