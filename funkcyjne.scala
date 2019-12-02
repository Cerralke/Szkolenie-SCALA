type Set = Int => Boolean

def contains(s: Set, x: Int) {
	s(x)
}

def singletonSet(x: Int) {
	y => x == y
}

def union(s: Set, t: Set) {
	y => contains(s, y) || contains(t, y)
}

def intersect(s: Set, t: Set) {
	y => contains(s, y) && contains(t, y)
}

def diff(s: Set, t: Set) {
	y => !(contains(s, y) && contains(t, y))
}

def filter(s: Set, p: Int => Boolean) {
	y => contains(s, y) && p(y)
}