import base64
import mmh3
import requests
import codecs
import argparse

parser = argparse.ArgumentParser()
parser.add_argument("u","url", help="URL to get favicon from")
parser.add_argument("f","favicon", help = "Supply the favicon's path")
parser.description = "Use the above hash in your Shodan query to find number of servers with the same favicon, Useful for finding servers which use specifc software/framework etc, which helps in finding vulnerabilities which might have bounty"


args = parser.parse_args()
url = args.url
favicon = args.favicon

if url:
    # Get the favicon
    # Try catch for errors
    try:
        r = requests.get(url + "/favicon.ico")
    except:
        print("Error getting favicon")
        exit()
    favicon = r.content
    favicon = codecs.encode(favicon, 'base64')
    favicon_hash = mmh3.hash(favicon)
elif favicon:
    # Get the favicon
    # Try catch block to handle errors and exit if favicon not found
    try:
        with open(favicon, 'rb') as f:
            favicon = f.read()
            favicon = codecs.encode(favicon, 'base64')
            favicon_hash = mmh3.hash(favicon)
    except FileNotFoundError:
        print("Favicon not found")
        exit()

print("http.favicon.hash:",hash)
