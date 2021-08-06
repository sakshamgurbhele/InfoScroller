A view group that allows the view hierarchy placed within it to be scrolled. Scroll view may have only one direct child placed within it. To add multiple views within the scroll view, make the direct child you add a view group, for example LinearLayout, and place additional views within that LinearLayout.

Scroll view supports vertical scrolling only. For horizontal scrolling, use HorizontalScrollView instead.

Never add a RecyclerView or ListView to a scroll view. Doing so results in poor user interface performance and a poor user experience.