var express = require('express');
var router = express.Router();

/* GET users listing. */
router.get('/', function(req, res, next) {
  res.send('respond with a resource');
});

router.get('/post', function(req, res, next) {
    var data = {name : "POST"};
    res.send('respond with a resources ' + data.name);
});

module.exports = router;
