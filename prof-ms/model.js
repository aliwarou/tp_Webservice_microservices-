const mongoose = require("mongoose");
const validator = require("validator");

const profSchema = new mongoose.Schema({
  nom: {
    type: String,
    required: [true, "le nom ne doit doit pas etre vide"],
    trim: true,
    unique: true,
  },
  prenom: {
    type: String,
    required: [true, "veillez entree un email valide"],
    validate: [validator.isEmail, "veillez entree un email valide "],
    unique: true,
    trim: true,
  },
  adresse: {
    type: String,
    required: [true, "entrez votre mot de passe "],
    trim: true,
    minlength: 8,
  },
});

const Prof = mongoose.model("Prof", profSchema);

module.exports = Prof;
