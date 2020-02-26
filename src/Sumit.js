const fs=require('fs')
const util=require('util');
const readFile=util.promisify(fs.readFile);

async function readTwoFiles(nyc,london) {
   const options={encoding:'utf-8'};
   const nyWeather= await readFile(nyc,options);
}
