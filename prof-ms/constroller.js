const Prof = require("./model");

exports.createProf = async (req, res, next) => {
  const doc = await Prof.create(req.body);
  res.status(201).json({
    status: "succes",
    data: "doc",
  });
};

exports.deleteProf = async (req, res, next) => {
  const doc = await Prof.findByIdAndDelete(req.params.id);
  if (!doc)
    return res
      .status(404)
      .json({ status: "error", msg: "no duncument found with that ID" });
  res.status(204).json({ status: "succes" });
};

exports.updateProf = async (req, res, next) => {
  const doc = await Prof.findByIdAndUpdate(req.params.id, req.body, {
    new: true,
    runValidators: true,
  });
  if (!doc)
    return res
      .status(404)
      .json({ status: "error", msg: "no prof found with that ID" });
  res.status(200).json({ status: "succes", data: { data: doc } });
};

exports.getProf = async (req, res, next) => {
  const doc = await Prof.findById(req.params.id);
  if (!doc)
    return res.status(404).json({ status: "error", msg: "prof not found" });
  res.status(200).json({ status: "succes", data: doc });
};

exports.getAllProf = async (req, res, next) => {
  const docs = await Prof.find();

  res
    .status(200)
    .json({ status: "succes", data: { results: docs.length, docs } });
};
