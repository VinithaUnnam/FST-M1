
import pytest

# Fixture to initialize the list of numbers from 0 to 10
@pytest.fixture
def number_list():
    return list(range(11))

# Test method to assert that the sum of the list is 55
def test_sum_of_list(number_list):
    assert sum(number_list) == 55
