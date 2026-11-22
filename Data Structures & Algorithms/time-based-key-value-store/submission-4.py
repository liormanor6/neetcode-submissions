class TimeMap:

    def __init__(self):
        self.time_map = {}

    def set(self, key: str, value: str, timestamp: int) -> None:
        key_array = self.time_map.get(key, [])
        key_array.append((timestamp, value))
        self.time_map[key] = key_array

    def get(self, key: str, timestamp: int) -> str:
        key_array = self.time_map.get(key, 0)
        if key_array == 0:
            return ""
        else:
            start = 0
            end = len(key_array) - 1
            result = ""
            while start <= end:
                middle = (start + end) // 2
                if key_array[middle][0] == timestamp:
                    return key_array[middle][1]
                if key_array[middle][0] < timestamp:
                    result = key_array[middle][1]
                    start = middle + 1
                else:
                    end = middle - 1
            return result

        
        
