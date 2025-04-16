players = [
{"name": "Alice", "score": 50},
 {"name": "Bob", "score": 75},
 {"name": "Charlie", "score": 90},
 {"name": "David", "score": 85},
 {"name": "Eve", "score": 78}, 
 ]


flat = [(name,score) for d in players for name, score in d.items()]
sorted_flat = sorted(flat, key=lambda x: x[1], reverse=True)

print(flat)
