<#include "top.ftl"/>
<script src="/static/js/echarts.min.js"></script>


    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">
            <!--overview start-->
            <div class="row">
                <div class="col-lg-12">
                    <h3 class="page-header"><i class="fa fa-laptop"></i> 运行信息(上次启动时间： ${res.startTime})</h3>
                    <ol class="breadcrumb">
                        <li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
                        <li><i class="fa fa-laptop"></i>Dashboard</li>
                    </ol>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                    <div class="info-box blue-bg">
                        <i class="fa fa-cloud-download"></i>
                        <div class="count">
                            <a href="/web/browser/download/1/10">${res.uploadFileCount}</a>
                        </div>
                        <div class="title">下载文件数</div>
                    </div><!--/.info-box-->
                </div><!--/.col-->
                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                    <div class="info-box brown-bg">
                        <i class="fa fa-shopping-cart"></i>
                        <div class="count">
                            <a href="/web/browser/history/1/10">${res.historyCount}</a>
                        </div>
                        <div class="title">浏览网页数</div>
                    </div><!--/.info-box-->
                </div><!--/.col-->

                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                    <div class="info-box dark-bg">
                        <i class="fa fa-thumbs-o-up"></i>
                        <div class="count">
                            <a href="/web/browser/domain/1/10">${res.domainCount}</a>
                        </div>
                        <div class="title">常用网站主页</div>
                    </div><!--/.info-box-->
                </div><!--/.col-->

                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                    <div class="info-box green-bg">
                        <i class="fa fa-cubes"></i>
                        <div class="count">
                            <a href="/web/browser/getInfo"><span id="pluginsCount"></span></a>
                        </div>
                        <div class="title">插件数</div>
                    </div><!--/.info-box-->
                </div><!--/.col-->

            </div><!--/.row-->
        </section>
        <div id="browse" class="div-inline" style="width: 50%;height:400px;float:right;"></div>
        <div id="perform" class="div-inline" style="width: 50%;height:400px;float:right;"></div>
    </section>
    <!--main content end-->
</section>
<!-- container section start -->

<#include "footer.ftl"/>

<style>
    .div-inline{ display:inline}
</style>

<script type="text/javascript">
    //获取插件所有的名称
    function getPluginName() {
        var info = "";
        var plugins = navigator.plugins;
        if (plugins.length > 0) {
            for (i = 0; i < navigator.plugins.length; i++) {
                info += navigator.plugins[i].name + ";";
            }
        }
        return info;
    }
    $(document).ready(function () {
        var plugins = navigator.plugins; //  安装在浏览器上的所有插件的数组
        $('#pluginsCount').text(plugins.length);
    })
</script>

<script type="text/javascript">
    $(document).ready(function () {
        getBrowseRunInfo();
        getBrowse();
        insertBwUseMem();
        setInterval("insertBwUseMem()",10000);
        setInterval("getBrowseRunInfo()", 10000);
    });

    function insertBwUseMem() {
        $.ajax({
            type: "get",
            url: "http://localhost:8080/web/browser/insertBrowseRunInfo",
            async: true
        });
    }

    function getBrowse() {
        $.ajax({
            type: "get",
            url: "http://localhost:8080/web/browser/getBrowse",
            async: false,
            success:function(data){
                if (data!=null && data!=undefined && data!=''){
                    data=JSON.parse(data);
                    var dateTime = new Array();
                    var countNum = new Array();
                    $(data).each(function(i){
                        dateTime[i] = data[i].dateTime;
                        countNum[i] = data[i].countNum;
                    });
                    option = {
                        title: {
                            text: '访问网站情况'
                        },
                        tooltip: {
                            trigger: 'axis'
                        },
                        grid: {
                            left: '3%',
                            right: '10%',
                            bottom: '3%',
                            containLabel: true
                        },
                        toolbox: {
                            feature: {
                                saveAsImage: {}
                            }
                        },
                        xAxis: {
                            type: 'category',
                            boundaryGap: false,
                            data: dateTime
                        },
                        yAxis: {
                            type: 'value'
                        },
                        series: [
                            {
                                name:'访问网站数',
                                type:'line',
                                stack: '总量',
                                data:countNum
                            }
                        ]
                    };
                }

                var myChart = echarts.init(document.getElementById('browse'));
                myChart.setOption(option);
            }
        });
    }

    function getBrowseRunInfo() {
        $.ajax({
            type: "get",
            url: "http://localhost:8080/web/browser/getBrowseRunInfo",
            async: false,
            success:function(data){
                if (data!=null && data!=undefined && data!=''){
                    data=JSON.parse(data);
                    var useMem = new Array();
                    var time = new Array();
                    $(data).each(function(i){
                        useMem[i] = data[i].useMem;
                        time[i] = data[i].created;
                    });
                    option = {
                        title: {
                            text: '浏览器性能'
                        },
                        tooltip: {
                            trigger: 'axis'
                        },
                        grid: {
                            left: '3%',
                            right: '10%',
                            bottom: '3%',
                            containLabel: true
                        },
                        toolbox: {
                            feature: {
                                saveAsImage: {}
                            }
                        },
                        xAxis: {
                            type: 'category',
                            boundaryGap: false,
                            data: time
                        },
                        yAxis: {
                            type: 'value'
                        },
                        series: [
                            {
                                name:'所耗内存（单位：KB）：',
                                type:'line',
                                stack: '总量',
                                data:useMem
                            }
                        ]
                    };
                }

                var myChart = echarts.init(document.getElementById('perform'));
                myChart.setOption(option);
            }
        });
    }

</script>

<style>
</style>

</body>
</html>
