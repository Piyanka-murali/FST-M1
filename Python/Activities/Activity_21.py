
import pytest

# ✅ Addition test
def test_addition():
    num1 = 10
    num2 = 15
    assert num1 + num2 == 25


# ✅ Subtraction test
def test_subtraction():
    num1 = 15
    num2 = 10
    assert num1 - num2 == 5


# ✅ Product test
def test_product():
    num1 = 5
    num2 = 4
    assert num1 * num2 == 20


# ✅ Quotient test
def test_quotient():
    num1 = 20
    num2 = 4
    assert num1 / num2 == 5
