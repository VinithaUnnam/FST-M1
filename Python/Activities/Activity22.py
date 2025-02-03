import pytest

# Functions to test
def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    if b == 0:
        return "Cannot divide by zero"
    return a / b

# Test cases
def test_add():
    assert add(2, 3) == 5
    assert add(-1, 1) == 0
    assert add(-2, -3) == -5

def test_subtract():
    assert subtract(5, 3) == 2
    assert subtract(3, 5) == -2
    assert subtract(0, 0) == 0

@pytest.mark.activity  # Applying the 'activity' marker
def test_multiply():
    assert multiply(3, 2) == 6
    assert multiply(0, 3) == 0
    assert multiply(-2, -3) == 6

@pytest.mark.activity  # Applying the 'activity' marker
def test_divide():
    assert divide(6, 3) == 2
    assert divide(5, 2) == 2.5
    assert divide(10, 0) == "Cannot divide by zero"
