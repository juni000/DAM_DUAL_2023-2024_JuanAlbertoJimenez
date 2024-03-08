/* What is in this file?
 * functions related to site header should go here
 * should be compatible with the Bootstrap 2 and Bootstrap 3 version of the site
 */

// do not close the dropdown if you click on an item has a
// data-stopPropagation="true" property
$("ul.dropdown-menu").on("click", "[data-stopPropagation]", function(e) {
    e.stopPropagation();
});

// show top banner if not closed before
$(function(){ if (typeof($.cookie)=='function' && !$.cookie('upgrade_bt')) {
    $("#banner-top").show().on("click", ".close", function(e) {
        // allow to close it with a click on X, and do not show it again for some time
        $("#banner-top").hide();
        $.cookie('upgrade_bt', 1, { expires: 7 }); // don't show the banner for 7 days
    });
} });

function loadNotPreloadedVideos() {
    // load videos, which were not loaded yet after main content is loaded,
    window.addEventListener('DOMContentLoaded', function() {
        var notPreloadedVideos = document.querySelectorAll("video[preload='none'][data-load-later]");
        for (var i = 0; i < notPreloadedVideos.length; i++) {
            var video = notPreloadedVideos[i];
            if (video.readyState === HTMLMediaElement.HAVE_NOTHING) {
                video.load();
                // https://stackoverflow.com/a/38081118/9491219
                if (window.navigator.userAgent.indexOf('Trident/') > -1) {
                    video.play();
                    video.pause();
                    if (video.currentTime > 0) {
                        video.currentTime = 0;
                    }
                }
            }
        }
    });
}

function playVideosOnHover(videoContainerSelector) {
    var videoHoverContainers = document.querySelectorAll(videoContainerSelector);
    for (var i = 0; i < videoHoverContainers.length; i++) {
        var videoContainer = videoHoverContainers[i];

        videoContainer.addEventListener('mouseover', function() {
            var video = this.querySelector('video');
            if (!video) return;
            // start playing in case video at least have metadata loaded,
            // this prevents jumping effect on hover, when poster is replaced
            // with actual video.
            if (video.readyState >= HTMLMediaElement.HAVE_METADATA) {
                video.playPromise = video.play();
            }
        });

        videoContainer.addEventListener('mouseout', function() {
            var video = this.querySelector('video');
            if (!video) return;
            if (video.currentTime > 0 && !video.paused) {
                // https://developers.google.com/web/updates/2017/06/play-request-was-interrupted#fix
                if (video.playPromise !== undefined) {
                    video.playPromise.then(function() {
                        this.pause();
                    }.bind(video));
                } else {
                    video.pause();
                }
            }
        });
    }
}

$(document).ready(function() {
    var $ralewayHeader = $("#header-raleway");

    if ($ralewayHeader.length) {
        var $body = $('body');
        var $hamburgerOverlay = $('#hamburger-overlay');
        var $hamburgerClose = $('#hamburger-close');
        var $hamburgerOpen = $('#hamburger-open');
        var $topLinks = $ralewayHeader.find('.top-link');
        var $requestDemoHamburger = $('.request-a-demo-hamburger');
        var $menuDropdown = $('.show-menu-dropdown-on-hover .dropdown .dropdown-group').add('.show-menu-dropdown-on-hover .product-dropdown-container');

        loadNotPreloadedVideos();
        playVideosOnHover('.mega-dropdown-menu-link');

        $hamburgerOverlay.hide().removeClass('hidden');
        $hamburgerClose.hide().removeClass('hidden');

        function closeHamburger() {
            $hamburgerOverlay.slideUp();
            $body.removeClass('overlay-open');
            $topLinks.removeClass('hidden');
            $hamburgerClose.hide();
            $hamburgerOpen.show();
        }

        $hamburgerOpen.on('click', function () {
            $hamburgerOverlay.slideDown();
            $body.addClass('overlay-open');
            $topLinks.addClass('hidden');
            $hamburgerOpen.hide();
            $hamburgerClose.show();
        });

        $hamburgerClose.on('click', function () {
            closeHamburger();
        });

        $requestDemoHamburger.on('click', function () {
            closeHamburger();
        });

        $menuDropdown.on('mouseover', function(){
            $(this).addClass('open');
        }).on('mouseout', function(){
            $(this).removeClass('open');
        });

        // showing mobile menu dynamically, taking into account condition
        // menu items overlapping with the logo on current screen resolution
        (function() {
            var navLogo = document.querySelector('#header-raleway .nav-logo');
            // that should be the very left element in the nav menu(after all float rearrangements)
            var productDropdown = document.getElementById('product-dropdown');

            if (!navLogo || !productDropdown) {
                return;
            }

            var navLogoRect = navLogo.getBoundingClientRect();
            var productDropdownRect = productDropdown.getBoundingClientRect();

            var isOverlapping = !(
                productDropdownRect.right < navLogoRect.left ||
                productDropdownRect.left > navLogoRect.right ||
                productDropdownRect.bottom < navLogoRect.top ||
                productDropdownRect.top > navLogoRect.bottom
            );

            // check if first menu item is shifted to the next row(line)
            var isShifted = productDropdownRect.top > navLogoRect.top;

            if (isOverlapping || isShifted) {
                document.getElementById('body-header').classList.add('mobile-menu-visible');
            }
        })();
    }

    // Header theme changer.
    // Need to display theme-transparent-on-light theme if full-width dropdown  
    // is open and header theme is theme-transparent-on-dark.
    var $fullWidthDropdownGroup = $('.full-width-dropdown .dropdown-group')
    var $darkTheme = $('.theme-transparent-on-dark');
    var $lightTheme = $('.theme-transparent-on-light');

    playVideosOnHover('.video-items-submenu-link');
    if ($fullWidthDropdownGroup.length) {
        var observerTarget = document.getElementById('body-header');
        var observerConfig = {
          attributes: true,
          attributeFilter: ['aria-expanded'],
          childList: true,
          subtree: true
        };

        function headerThemeChanger(mutations) {
            mutations.forEach(function(mutation) {
                if (mutation.target.ariaExpanded == 'true') {
                    $darkTheme.removeClass('theme-transparent-on-dark').addClass('theme-transparent-on-light');
                    $darkTheme.css('background-color', 'white');
                    $lightTheme.css('background-color', 'white');
                } else {
                    $darkTheme.removeClass('theme-transparent-on-light').addClass('theme-transparent-on-dark');
                    $darkTheme.css('background-color', '');
                    $lightTheme.css('background-color', '');
                }
            });
        }
        var bodyHeaderObserver = new MutationObserver(headerThemeChanger);
        bodyHeaderObserver.observe(observerTarget, observerConfig);
    }
 
    $('#prezi-video-explaining').on('click', function(e) {
        e.preventDefault();
        var embeddedVideoLink = $(this).attr("href");
        $(e).attr('data-remote', embeddedVideoLink);
        $(e).attr('data-type', 'video');
        $(e).ekkoLightbox({
            'modal_id': 'prezi-video-explaining-modal',
            'loadingMessage': '',
            'footer': '<a href="#" data-dismiss="modal" class="pull-right close modal-close"><svg width="17px" height="23px" viewBox="0 0 26 27" version="1.1" xmlns="http://www.w3.org/2000/svg"> <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"> <g transform="translate(-389, -14)" fill="CurrentColor"> <g transform="translate(388, 14)"> <rect transform="translate(14, 14) rotate(-45) translate(-14, -14)" x="-3" y="12" width="34" height="5" rx="2"/> <rect transform="translate(14, 14) rotate(45) translate(-14, -14)" x="-3" y="12" width="34" height="5" rx="2"/> </g> </g> </g> </svg></a>'
        });
    }); 
});
