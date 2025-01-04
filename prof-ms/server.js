/* eslint-disable no-console */
const dotenv = require("dotenv");
const mongoose = require("mongoose");

process.on("uncaughtException", (err) => {
  console.log("UNCAUGHT EXCEPTION  Shuting down...");
  console.log(err);
  process.exit(1);
});

dotenv.config({ path: "./config.env" });
const app = require("./app");

const db = process.env.DATABASE;

mongoose
  .connect(db, {
    autoIndex: true,
  })
  .then(() => console.log("DB connection successfful!"));

const server = app.listen(process.env.PORT, () => {
  console.log(`the server running on http://localhost:${process.env.PORT}...`);
});

// process.on("unhandledRejection", (err) => {
//   console.log("UNHANDLED REJECTION Shuting down...");

//   console.log(err);
//   server.close(() => {
//     process.exit(1);
//   });
// });
