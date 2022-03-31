$(function(){
    //제목 클릭시 노래 목록 나오게 하기
    $("h1.title").click(function(){
        $("ul.music-list").slideDown('slow');
    });
    //제목 클릭시 목록 다시 없애기
    $(".music-list li").click(function(){
        //1. 클릭한 곳의 노래 제목을 변수 title에 저장
        var title=$(this).text();

        //2.title을 h1.title에 넣기
        $("h1.title").text(title);

        //3.class이름을 얻는다(변수명 clname)
        var clname=$(this).attr("class");

        //4.cd change #cd의 width를 0으로 하고 완료시 호출되는 함수에서
        //#cd에 clname을 class로 추가하고 width를 다시 300px로 
        $("#cd").animate({"width":"0px"},'slow',function(){
            $("#cd").attr("class",clname);
            $(this).animate({"width":"300px"},'slow');
        });
        $(".music-list").slideUp('slow');
    });
});