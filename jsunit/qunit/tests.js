QUnit.test( "hello test", function( assert ) {
  assert.ok( 1 == "1");
});

QUnit.test( "hello test2", function( assert ) {
  assert.equal(2,  sum(1, 1));
  assert.equal(4,  sum(2, 2));
});
