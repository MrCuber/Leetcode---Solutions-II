# Leetcode---Solutions
<h2>
    <a href="https://leetcode.com/problems/score-of-a-string/?envType=daily-question&envId=2024-06-01">
        3110.Score of a String
    </a>
</h2>
<h3>
    Easy
</h3>
<p>You are given a string <code>s</code>. The <strong>score</strong> of a string is defined as the sum of the absolute difference between the <strong>ASCII</strong> values of adjacent characters.</p>

<p>Return the <strong>score</strong> of<em> </em><code>s</code>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<div>
<p><strong>Input:</strong> <span>s = "hello"</span></p>

<p><strong>Output:</strong> <span>13</span></p>

<p><strong>Explanation:</strong></p>

<p>The <strong>ASCII</strong> values of the characters in <code>s</code> are: <code>'h' = 104</code>, <code>'e' = 101</code>, <code>'l' = 108</code>, <code>'o' = 111</code>. So, the score of <code>s</code> would be <code>|104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13</code>.</p>
</div>

<p><strong>Example 2:</strong></p>

<div class>
<p><strong>Input:</strong> <span>s = "zaz"</span></p>

<p><strong>Output:</strong> <span>50</span></p>

<p><strong>Explanation:</strong></p>

<p>The <strong>ASCII</strong> values of the characters in <code>s</code> are: <code>'z' = 122</code>, <code>'a' = 97</code>. So, the score of <code>s</code> would be <code>|122 - 97| + |97 - 122| = 25 + 25 = 50</code>.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code> consists only of lowercase English letters.</li>
</ul>