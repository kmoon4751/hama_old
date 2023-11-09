
    // '모여봐요' 게시글 조회 함수
    async function savepost(){
        const option = {
        method : 'GET',
        headers : {Accept : 'application/json'},
        };
        try {
            const url = '/community/gethering/all';  //commu_gubun : '모여봐요'
            const response = await fetch(url,option);
            const data = await response.json();
            console.log(data);
            console.log("목록호출됨");
            post(data.body);
        } catch(err){
            console.error(err.message);
        }
    };


savepost();