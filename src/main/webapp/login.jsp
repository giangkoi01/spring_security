
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
    <style>
        body {
            padding: 0px;
            margin: 0px;
            padding-left: 30%;
            padding-top: 5px;
        }

        .Container {
            width: 540px;
            height: 620px;
            padding: 20px 20px 36px 20px;
            border-radius: 4px;
            box-shadow: 0 2px 4px 0 rgba(3, 3, 4, 0.1), 0 0 1px 0 rgba(239, 242, 247, 0.5);
            background-color: #fff;
            text-align: center;

        }

        .Sign-In {
            width: 99px;
            height: 37px;
            margin: 0 auto 50px;
            font-family: Muli;
            font-size: 28px;
            font-weight: normal;
            font-stretch: normal;
            font-style: normal;
            line-height: 1.32;
            letter-spacing: 0.1px;
            text-align: center;
            color: #000a12;
        }

        .-Input-Label {
            width: 92%;
            height: 72px;
            margin: 50px 0 20px;
            text-align: left;
            position: relative;
        }

        .Light-Grey {
            width: 164px;
            height: 20px;
            margin: 0 336px 8px 0;
            padding: 0 121px 0 0;
        }

        .Type {
            width: 43px;
            height: 20px;
            font-family: Roboto;
            font-size: 17px;
            font-weight: normal;
            font-stretch: normal;
            font-style: normal;
            line-height: 1.18;
            letter-spacing: 0.08px;
            color: #b8c1cb;
        }

        .Normal {
            width: 100%;
            height: 50px;
            margin: 8px 0 0;
            padding: 6px 14px;
            border-radius: 4px;
            box-shadow: inset 0 1px 2px 0 rgba(102, 113, 123, 0.21), inset 0 0 0 1px rgba(102, 113, 123, 0.25);
            border: solid 1px #d3dce6;
            background-color: #fff;
        }



        .Fill {
            width: 24px;
            height: 24px;
            right: 0;
            bottom: -6px;
            background-color: #13cb65;
            position: absolute;
        }

        .Icon-box {
            width: 24px;
            height: 24px;
        }

        .Forgot-your-password {
            width: 500px;
            height: 24px;
            margin: 30px auto 0;
            font-family: Roboto;
            font-size: 18px;
            font-weight: normal;
            font-stretch: normal;
            font-style: normal;
            line-height: 1.33;
            letter-spacing: 0.09px;
            text-align: center;
            padding-left: 10px;
            color: #778f9b;
        }

        .white-login {
            width: 100%;
            height: 60px;
            margin: 95px auto 20px;
            padding: 20px 0;
            background-color: #0078e8;
            border-radius: 30px;
        }
        .white-loginfacebook {
            width: 100%;
            height: 60px;
            margin: 95px auto 20px;
            padding: 20px 0;
            background-color: #009dff;
            border-radius: 30px;
        }

        .white-type {
            width: 50px;
            height: 20px;
            font-family: Roboto;
            font-size: 20px;
            font-weight: 500;
            font-stretch: normal;
            font-style: normal;
            line-height: 1;
            letter-spacing: normal;
            text-align: center;
            color: white;
        }
        .error {
            color: red;
        }

    </style>
</head>
<body>
<form  method="POST" >
  <div class="Container" style="resize: horizontal;overflow:auto ;">
            <span class="Sign-In">
                Sign in
            </span>
    <div class="-Input-Label">
      <div class="Light-Grey">
                    <span class="Type">
                        Login
                    </span>
      </div>
      <input id="username" name="username" type="text" placeholder="hello@robowolf.net" class="Normal">
      <div class="Fill">
        <div class="Check-Circle">
          <div class="Icon-box"><img src="icon/icon-basic-check-circle.png" /></div>
        </div>
      </div>
    </div>

    <div class="-Input-Label">
      <div class="Light-Grey">
                <span class="Type">
                    Password
                </span>
      </div>
      <input id="password" name="password" type="password" placeholder="⦁⦁⦁⦁⦁⦁⦁⦁⦁⦁⦁" class="Normal">
      <div class="Fill">
        <div class="Check-Circle">
          <div class="Icon-box"><img src="icon/icon-basic-lock.png"/></div>
        </div>
      </div>
      </input>
    </div>

    <div style="width:100%; height: 120px;">
      <button type="submit" class="white-login"><span class="white-type">Login</span></button>
    </div>

    <div style="width:100%; height: 60px;">
      <button type="button" class="white-loginfacebook"><span class="white-type">Login from facebook</span></button>
    </div><br><br><br><br><br><br>
    <span  class="Forgot-your-password">
            Forgot your password?
        </span>
  </div>
</form>
</body>
</html>


