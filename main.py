import sys

# Remove these 2 lines while submitting your code online
sys.stdin = open('input.txt', 'r')
sys.stdout = open('output.txt', 'w')


def solve(test):
    # Do your thing here :)
    print(test)


def main():
    test_case = int(input())
    for test in range(test_case):
        solve(test + 1)


if __name__ == "__main__":
    main()
