# Leetcode---Solutions
<h2>
    <a href="https://leetcode.com/problems/strange-printer/?envType=daily-question&envId=2024-08-21">
        664.Strange Printer
    </a>
</h2>
<h3>
    Hard
</h3>
<p>There is a strange printer with the following two special properties:</p>

<ul>
	<li>The printer can only print a sequence of <strong>the same character</strong> each time.</li>
	<li>At each turn, the printer can print new characters starting from and ending at any place and will cover the original existing characters.</li>
</ul>

<p>Given a string <code>s</code>, return <em>the minimum number of turns the printer needed to print it</em>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> s = "aaabbb"
<strong>Output:</strong> 2
<strong>Explanation:</strong> Print "aaa" first and then print "bbb".
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> s = "aba"
<strong>Output:</strong> 2
<strong>Explanation:</strong> Print "aaa" first and then print "b" from the second place of the string, which will cover the existing character 
'a'.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code> consists of lowercase English letters.</li>
</ul>
