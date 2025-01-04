const express = require("express");
const controller = require("./constroller");
const profrouter = require("./router");

const app = express();

app.use("/prof", profrouter);

app.listen(8899, () => {
  console.log("server en cours");
});

module.exports = app;
