
import pytest

# Fixture to initialize the wallet amount
@pytest.fixture
def wallet():
    return 0  # Initial wallet amount

# Parameterized test for different earned, spent, and expected values
@pytest.mark.parametrize("earned, spent, expected", [
    (30, 10, 20),  # Test 1
    (20, 2, 18),   # Test 2
])
def test_transactions(wallet, earned, spent, expected):
    # Add money to the wallet
    wallet += earned
    
    # Subtract money from the wallet
    wallet -= spent
    
    # Assert that the wallet has the expected remaining amount
    assert wallet == expected
