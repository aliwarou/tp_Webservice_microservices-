const express = require("express");
const controller = require("./constroller");

const router = express.Router();

router.route("/").get(controller.getAllProf).post(controller.createProf);

router
  .route("/:id")
  .get(controller.getProf)
  .patch(controller.updateProf)
  .delete(controller.deleteProf);

module.exports = router;
