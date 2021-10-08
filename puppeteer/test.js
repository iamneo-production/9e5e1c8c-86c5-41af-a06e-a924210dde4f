const puppeteer = require('puppeteer');
(async () => {
    const browser = await puppeteer.launch();
    const page = await browser.newPage();
    try{
    await page.goto('https://8081-dadbddafcedfaaeabaacaefaddadcafda.examlyiopb.examly.io/');
    await page.setViewport({
      width:1200,
      height:800,
    })
	  await page.click('#signupLink');
	  await page.waitForNavigation();
	  await page.type('#email', 'test@gmail.com');
	  await page.type('#username', 'testuser');
	  await page.type('#mobileNumber', '9876543210');
	  await page.type('#password', 'Test@123');
	  await page.type('#confirmPassword', 'Test@123');
	  await page.click('#submitButton');
	  await page.waitForNavigation();
      await page.waitForSelector('#loginBox',{timeout:3000});
      console.log('TESTCASE:FE_Signup:success');
    }
     catch(e){
      console.log('TESTCASE:FE_Signup:failure');
    }finally{
      await page.close();
      await browser.close();
    }
    
})();

(async () => {
    const browser = await puppeteer.launch();
    const page = await browser.newPage();
    try{
    await page.goto('https://8081-dadbddafcedfaaeabaacaefaddadcafda.examlyiopb.examly.io/');
    await page.setViewport({
      width:1200,
      height:800,
    })
	  await page.type('#email', 'test@gmail.com');
	  await page.type('#password', 'testuser');
	  await page.click('#loginButton');
	  await page.waitForNavigation();
      await page.waitForSelector('#homeButton',{timeout:3000});
      console.log('TESTCASE:FE_Login:success');
    }
     catch(e){
      console.log('TESTCASE:FE_Login:failure');
    }finally{
      await page.close();
      await browser.close();
    }
    
})();

(async () => {
    const browser = await puppeteer.launch();
    const page = await browser.newPage();
    try{
    await page.goto('https://8081-dadbddafcedfaaeabaacaefaddadcafda.examlyiopb.examly.io/');
    await page.setViewport({
      width:1200,
      height:800,
    })
	  await page.type('#email', 'test@gmail.com');
	  await page.type('#password', 'testuser');
	  await page.click('#loginButton');
	  await page.waitForNavigation();
      await page.waitForSelector('#addButton',{timeout:3000});
      await page.click('#addButton');
	  await page.waitForSelector('#addHomeBody',{timeout:3000});
	  console.log('TESTCASE:FE_Add_Issues:success');
    }
     catch(e){
      console.log('TESTCASE:FE_Add_Issues:failure');
    }finally{
      await page.close();
      await browser.close();
    }
    
})();

(async () => {
    const browser = await puppeteer.launch();
    const page = await browser.newPage();
    try{
    await page.goto('https://8081-dadbddafcedfaaeabaacaefaddadcafda.examlyiopb.examly.io/');
    await page.setViewport({
      width:1200,
      height:800,
    })
	  await page.type('#email', 'test@gmail.com');
	  await page.type('#password', 'testuser');
	  await page.click('#loginButton');
	  await page.waitForNavigation();
      await page.waitForSelector('#grid1',{timeout:3000});
	  await page.waitForSelector('#userDetails',{timeout:3000});
	  console.log('TESTCASE:FE_Issues:success');
    }
     catch(e){
      console.log('TESTCASE:FE_Issues:failure');
    }finally{
      await page.close();
      await browser.close();
    }
    
})();