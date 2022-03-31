$(function(){
    var n=0;//맞춘 인형 개수
    //총을 클릭하면 0~11사이의 랜덤값을 발생
    //해당 인형을 안보이게 처리
    //메세지창 : 1번째 인형을 맞추었습니다
    //1번이 이미 사라지고 없는 경우
    //"1번 인형은 이미 처리 되었습니다"
    //12개의 인형이 모두 사라지면 "You Win!!Game Over!!"
    $(".gun").click(function(){
        var idx=parseInt(Math.random()*12); //0~11
        //ceil:무조건 올림, floor:무조건 내림, round:반올림
        // var idx=Math.floor(Math.random()*11);//무조건 내림
        // var idx=Math.ceil(Math.random()*11);//무조건 올림
        console.log(idx);
        if($(".sunban li img").eq(idx).is(":hidden")){
            $("#msg").html((idx+1)+"번 인형은 이미 처리되었습니다.");
        }else{
            n++;//새로운 인형을 맞출 때마다 1증가
            $("#msg").html((idx+1)+"번 인형을 맞췄네요!!");
            $(".sunban li img").eq(idx).hide();
            // $(".sunban li img").eq(idx).fadeOut('slow');
        }

        if(n>=12){
            $("#msg").html("game over! you win!");
            $(".money li").addClass("active");

            $(".money img").click(function(){
                // $(this).hide();//hide는 자리차지x
                $(this).css("opacity","0");//투명도 0, 자리를 차지함
                n=0;
                $(".sunban li img").show();
                $("#msg").html("");
            });
        }        
    });

    //money를 클릭하면 모두 초기화(사라진 인형 재배치, 메세지창 지우기) 후 해당 지폐는 안 보이게 
    // $(".money img").click(function(){
    //     $(this).hide();//hide는 자리차지x
    //     n=0;
    //     $(".sunban li img").show();
    //     $("#msg").html("");
    // });
});