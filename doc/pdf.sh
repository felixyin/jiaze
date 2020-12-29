#!env sh
# 生成pdf

# 环境nodejs cnpm
# sudo cnpm install gitbook-cli -g
# gitbook 使用教程： https://www.jianshu.com/p/421cc442f06c
# gitbook pdf依赖软件安装（sudo apt install calibre）或参考链接：https://www.jianshu.com/p/5e5d76a54328  https://calibre-ebook.com/
# compress-pdf : https://github.com/jbenet/compress-pdf > ~/bin

if [ x$1 != x ]; then
	echo '>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 生成pdf：'
	rm *.pdf
	gitbook pdf ./ ./.pre.pdf --log=debug

	echo '>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 压缩pdf:'
	compress-pdf .pre.pdf "解决方案$1.pdf"
	rm .pre.pdf

	echo '>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 一切准备就绪，可以pub到站点了'
else
	echo "生成PDF，必须带有版本参数，Usage："
	echo "./pdf.sh V0.2"
	echo "./pdf.sh V2.3"
fi
