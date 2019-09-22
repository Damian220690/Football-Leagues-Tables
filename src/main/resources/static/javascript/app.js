$(function(){

    $('.fa.fa-plus').on('click',function(){
        var tBodyClassName = 'info ' + $(this).parent().parent().parent().parent().attr('class') ;
        if($('tr').hasClass(tBodyClassName)){
            var res = tBodyClassName.split(" ");
            var preparedClassName = '.'+ res[0] + '.'+ res[1] + '.'+res[2];
            $(preparedClassName).toggleClass('enabledAdditionalInfo');
        }
    });
});