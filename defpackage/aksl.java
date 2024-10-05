package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksl {
    public final vje a;
    public final vjc b;
    public final amnv c;
    public final amnv d;
    public final amnv e;
    public final amnv f;
    public final amnv g;
    public final amnv h;
    public final amnv i;
    public final amnv j;
    public final amnv k;
    public final amnv l;
    public final amnv m;
    public final amnv n;
    public final amnv o;
    public final amnv p;
    public final amnv q;
    public final amnv r;
    public final amnv s;
    private final amnv t;
    private final amnv u;
    private final amnv v;
    private final amnv w;
    private final amnv x;

    public aksl(ScheduledExecutorService scheduledExecutorService, vjf vjfVar) {
        final int i = 1;
        amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i2 = 11;
        this.c = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i2) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i3 = 3;
        this.d = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i3) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i4 = 13;
        this.e = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i4) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i5 = 14;
        this.f = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i5) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i6 = 15;
        amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i6) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i7 = 16;
        amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i7) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i8 = 17;
        this.t = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i8) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i9 = 18;
        this.u = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i9) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i10 = 19;
        amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i10) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i11 = 20;
        this.g = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i11) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        amkq.x(new amnv(this) { // from class: aksk
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i12 = i;
                if (i12 == 0) {
                    viz e = this.a.a.e("/client_streamz/youtube/music/offline/missing_offline_music_data", viy.c("type"));
                    e.c();
                    return e;
                }
                if (i12 == 1) {
                    viz e2 = this.a.a.e("/client_streamz/youtube/music/queue/creation_event_count", viy.c("queue_creation_status"));
                    e2.c();
                    return e2;
                }
                if (i12 == 2) {
                    viz e3 = this.a.a.e("/client_streamz/youtube/search/suggest/error_count", viy.c("suggest_error"), viy.c("error_source"));
                    e3.c();
                    return e3;
                }
                if (i12 == 3) {
                    viz e4 = this.a.a.e("/client_streamz/youtube/offline/stream_verification", viy.c("verify_type"), viy.c("verify_result"), viy.c("verify_strategy"), viy.c("playback_exception_type"));
                    e4.c();
                    return e4;
                }
                if (i12 == 4) {
                    viz e5 = this.a.a.e("/client_streamz/youtube/offline_privacy_migration", viy.c("migration_location"), viy.c("migration_state"));
                    e5.c();
                    return e5;
                }
                if (i12 == 5) {
                    viz e6 = this.a.a.e("/client_streamz/youtube/notifications/invalidation_count", viy.c("invalidation_event"));
                    e6.c();
                    return e6;
                }
                viz e7 = this.a.a.e("/client_streamz/youtube/notifications/background_data_count", viy.c("background_data_event"));
                e7.c();
                return e7;
            }
        });
        final int i12 = 0;
        amkq.x(new amnv(this) { // from class: aksk
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i122 = i12;
                if (i122 == 0) {
                    viz e = this.a.a.e("/client_streamz/youtube/music/offline/missing_offline_music_data", viy.c("type"));
                    e.c();
                    return e;
                }
                if (i122 == 1) {
                    viz e2 = this.a.a.e("/client_streamz/youtube/music/queue/creation_event_count", viy.c("queue_creation_status"));
                    e2.c();
                    return e2;
                }
                if (i122 == 2) {
                    viz e3 = this.a.a.e("/client_streamz/youtube/search/suggest/error_count", viy.c("suggest_error"), viy.c("error_source"));
                    e3.c();
                    return e3;
                }
                if (i122 == 3) {
                    viz e4 = this.a.a.e("/client_streamz/youtube/offline/stream_verification", viy.c("verify_type"), viy.c("verify_result"), viy.c("verify_strategy"), viy.c("playback_exception_type"));
                    e4.c();
                    return e4;
                }
                if (i122 == 4) {
                    viz e5 = this.a.a.e("/client_streamz/youtube/offline_privacy_migration", viy.c("migration_location"), viy.c("migration_state"));
                    e5.c();
                    return e5;
                }
                if (i122 == 5) {
                    viz e6 = this.a.a.e("/client_streamz/youtube/notifications/invalidation_count", viy.c("invalidation_event"));
                    e6.c();
                    return e6;
                }
                viz e7 = this.a.a.e("/client_streamz/youtube/notifications/background_data_count", viy.c("background_data_event"));
                e7.c();
                return e7;
            }
        });
        final int i13 = 2;
        this.v = amkq.x(new amnv(this) { // from class: aksk
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i122 = i13;
                if (i122 == 0) {
                    viz e = this.a.a.e("/client_streamz/youtube/music/offline/missing_offline_music_data", viy.c("type"));
                    e.c();
                    return e;
                }
                if (i122 == 1) {
                    viz e2 = this.a.a.e("/client_streamz/youtube/music/queue/creation_event_count", viy.c("queue_creation_status"));
                    e2.c();
                    return e2;
                }
                if (i122 == 2) {
                    viz e3 = this.a.a.e("/client_streamz/youtube/search/suggest/error_count", viy.c("suggest_error"), viy.c("error_source"));
                    e3.c();
                    return e3;
                }
                if (i122 == 3) {
                    viz e4 = this.a.a.e("/client_streamz/youtube/offline/stream_verification", viy.c("verify_type"), viy.c("verify_result"), viy.c("verify_strategy"), viy.c("playback_exception_type"));
                    e4.c();
                    return e4;
                }
                if (i122 == 4) {
                    viz e5 = this.a.a.e("/client_streamz/youtube/offline_privacy_migration", viy.c("migration_location"), viy.c("migration_state"));
                    e5.c();
                    return e5;
                }
                if (i122 == 5) {
                    viz e6 = this.a.a.e("/client_streamz/youtube/notifications/invalidation_count", viy.c("invalidation_event"));
                    e6.c();
                    return e6;
                }
                viz e7 = this.a.a.e("/client_streamz/youtube/notifications/background_data_count", viy.c("background_data_event"));
                e7.c();
                return e7;
            }
        });
        this.h = amkq.x(new amnv(this) { // from class: aksk
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i122 = i3;
                if (i122 == 0) {
                    viz e = this.a.a.e("/client_streamz/youtube/music/offline/missing_offline_music_data", viy.c("type"));
                    e.c();
                    return e;
                }
                if (i122 == 1) {
                    viz e2 = this.a.a.e("/client_streamz/youtube/music/queue/creation_event_count", viy.c("queue_creation_status"));
                    e2.c();
                    return e2;
                }
                if (i122 == 2) {
                    viz e3 = this.a.a.e("/client_streamz/youtube/search/suggest/error_count", viy.c("suggest_error"), viy.c("error_source"));
                    e3.c();
                    return e3;
                }
                if (i122 == 3) {
                    viz e4 = this.a.a.e("/client_streamz/youtube/offline/stream_verification", viy.c("verify_type"), viy.c("verify_result"), viy.c("verify_strategy"), viy.c("playback_exception_type"));
                    e4.c();
                    return e4;
                }
                if (i122 == 4) {
                    viz e5 = this.a.a.e("/client_streamz/youtube/offline_privacy_migration", viy.c("migration_location"), viy.c("migration_state"));
                    e5.c();
                    return e5;
                }
                if (i122 == 5) {
                    viz e6 = this.a.a.e("/client_streamz/youtube/notifications/invalidation_count", viy.c("invalidation_event"));
                    e6.c();
                    return e6;
                }
                viz e7 = this.a.a.e("/client_streamz/youtube/notifications/background_data_count", viy.c("background_data_event"));
                e7.c();
                return e7;
            }
        });
        final int i14 = 4;
        this.i = amkq.x(new amnv(this) { // from class: aksk
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i122 = i14;
                if (i122 == 0) {
                    viz e = this.a.a.e("/client_streamz/youtube/music/offline/missing_offline_music_data", viy.c("type"));
                    e.c();
                    return e;
                }
                if (i122 == 1) {
                    viz e2 = this.a.a.e("/client_streamz/youtube/music/queue/creation_event_count", viy.c("queue_creation_status"));
                    e2.c();
                    return e2;
                }
                if (i122 == 2) {
                    viz e3 = this.a.a.e("/client_streamz/youtube/search/suggest/error_count", viy.c("suggest_error"), viy.c("error_source"));
                    e3.c();
                    return e3;
                }
                if (i122 == 3) {
                    viz e4 = this.a.a.e("/client_streamz/youtube/offline/stream_verification", viy.c("verify_type"), viy.c("verify_result"), viy.c("verify_strategy"), viy.c("playback_exception_type"));
                    e4.c();
                    return e4;
                }
                if (i122 == 4) {
                    viz e5 = this.a.a.e("/client_streamz/youtube/offline_privacy_migration", viy.c("migration_location"), viy.c("migration_state"));
                    e5.c();
                    return e5;
                }
                if (i122 == 5) {
                    viz e6 = this.a.a.e("/client_streamz/youtube/notifications/invalidation_count", viy.c("invalidation_event"));
                    e6.c();
                    return e6;
                }
                viz e7 = this.a.a.e("/client_streamz/youtube/notifications/background_data_count", viy.c("background_data_event"));
                e7.c();
                return e7;
            }
        });
        final int i15 = 5;
        this.j = amkq.x(new amnv(this) { // from class: aksk
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i122 = i15;
                if (i122 == 0) {
                    viz e = this.a.a.e("/client_streamz/youtube/music/offline/missing_offline_music_data", viy.c("type"));
                    e.c();
                    return e;
                }
                if (i122 == 1) {
                    viz e2 = this.a.a.e("/client_streamz/youtube/music/queue/creation_event_count", viy.c("queue_creation_status"));
                    e2.c();
                    return e2;
                }
                if (i122 == 2) {
                    viz e3 = this.a.a.e("/client_streamz/youtube/search/suggest/error_count", viy.c("suggest_error"), viy.c("error_source"));
                    e3.c();
                    return e3;
                }
                if (i122 == 3) {
                    viz e4 = this.a.a.e("/client_streamz/youtube/offline/stream_verification", viy.c("verify_type"), viy.c("verify_result"), viy.c("verify_strategy"), viy.c("playback_exception_type"));
                    e4.c();
                    return e4;
                }
                if (i122 == 4) {
                    viz e5 = this.a.a.e("/client_streamz/youtube/offline_privacy_migration", viy.c("migration_location"), viy.c("migration_state"));
                    e5.c();
                    return e5;
                }
                if (i122 == 5) {
                    viz e6 = this.a.a.e("/client_streamz/youtube/notifications/invalidation_count", viy.c("invalidation_event"));
                    e6.c();
                    return e6;
                }
                viz e7 = this.a.a.e("/client_streamz/youtube/notifications/background_data_count", viy.c("background_data_event"));
                e7.c();
                return e7;
            }
        });
        final int i16 = 6;
        this.k = amkq.x(new amnv(this) { // from class: aksk
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i122 = i16;
                if (i122 == 0) {
                    viz e = this.a.a.e("/client_streamz/youtube/music/offline/missing_offline_music_data", viy.c("type"));
                    e.c();
                    return e;
                }
                if (i122 == 1) {
                    viz e2 = this.a.a.e("/client_streamz/youtube/music/queue/creation_event_count", viy.c("queue_creation_status"));
                    e2.c();
                    return e2;
                }
                if (i122 == 2) {
                    viz e3 = this.a.a.e("/client_streamz/youtube/search/suggest/error_count", viy.c("suggest_error"), viy.c("error_source"));
                    e3.c();
                    return e3;
                }
                if (i122 == 3) {
                    viz e4 = this.a.a.e("/client_streamz/youtube/offline/stream_verification", viy.c("verify_type"), viy.c("verify_result"), viy.c("verify_strategy"), viy.c("playback_exception_type"));
                    e4.c();
                    return e4;
                }
                if (i122 == 4) {
                    viz e5 = this.a.a.e("/client_streamz/youtube/offline_privacy_migration", viy.c("migration_location"), viy.c("migration_state"));
                    e5.c();
                    return e5;
                }
                if (i122 == 5) {
                    viz e6 = this.a.a.e("/client_streamz/youtube/notifications/invalidation_count", viy.c("invalidation_event"));
                    e6.c();
                    return e6;
                }
                viz e7 = this.a.a.e("/client_streamz/youtube/notifications/background_data_count", viy.c("background_data_event"));
                e7.c();
                return e7;
            }
        });
        this.l = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i12) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        this.m = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i13) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        this.n = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i14) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        this.o = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i15) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        this.p = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i16) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i17 = 7;
        this.w = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i17) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i18 = 8;
        this.x = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i18) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i19 = 9;
        this.q = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i19) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i20 = 10;
        this.r = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i20) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        final int i21 = 12;
        this.s = amkq.x(new amnv(this) { // from class: aksj
            public final /* synthetic */ aksl a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i21) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/youtube/notifications/push_count", viy.c("event_type"), viy.a("is_error"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", viy.c("filling_type"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/youtube/notifications/message_count", viy.c("message_type"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/youtube/notifications/topic_sub_count", viy.c("event_type"), viy.a("is_success"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/youtube/notifications/registration_attempt", viy.c("registration_trigger"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/youtube/notifications/registration_event", viy.c("registration_event"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_count", viy.c("page_type"));
                        e8.c();
                        return e8;
                    case 8:
                        viz e9 = this.a.a.e("/client_streamz/youtube/thumbnail_loading_error_count", viy.c("page_type"));
                        e9.c();
                        return e9;
                    case 9:
                        viw b = this.a.a.b("/client_streamz/youtube/feedback_psd_size", new viy[0]);
                        b.c();
                        return b;
                    case 10:
                        viz e10 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", viy.c("pairing_type"), viy.c("previous_connection_state"), viy.c("error_type"), viy.b("refreshed_token_count"));
                        e10.c();
                        return e10;
                    case 11:
                        viz e11 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e11.c();
                        return e11;
                    case 12:
                        viz e12 = this.a.a.e("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", viy.c("pairing_type"));
                        e12.c();
                        return e12;
                    case 13:
                        viz e13 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e13.c();
                        return e13;
                    case 14:
                        viz e14 = this.a.a.e("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", viy.c("state_entry_data_type"), viy.c("exp_tag"));
                        e14.c();
                        return e14;
                    case 15:
                        viw b2 = this.a.a.b("/client_streamz/youtube/video_ads/cue_duration", viy.c("cue_duration_state"), viy.a("is_forced_return"));
                        b2.c();
                        return b2;
                    case 16:
                        viz e15 = this.a.a.e("/client_streamz/youtube/video_ads/cue_state", viy.a("is_cue_start_time_changed"), viy.a("has_predict_start_cuepoint"), viy.a("has_start_cuepoint"), viy.a("has_continue_cuepoint"), viy.a("has_stop_cuepoint"));
                        e15.c();
                        return e15;
                    case 17:
                        viz e16 = this.a.a.e("/client_streamz/youtube/image_load", viy.c("image_service_type"), viy.c("cache_type"), viy.a("is_error"));
                        e16.c();
                        return e16;
                    case 18:
                        viz e17 = this.a.a.e("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", viy.a("is_a11y_enabled"), viy.c("kazoo_client"));
                        e17.c();
                        return e17;
                    case 19:
                        viz e18 = this.a.a.e("/client_streamz/youtube/livecreation/webrtc_encoder", viy.c("encoder"), viy.c("codec"));
                        e18.c();
                        return e18;
                    default:
                        viz e19 = this.a.a.e("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", viy.c("result"));
                        e19.c();
                        return e19;
                }
            }
        });
        vje c = vje.c("youtube_android");
        this.a = c;
        vjc vjcVar = c.a;
        if (vjcVar == null) {
            this.b = vjj.a(vjfVar, scheduledExecutorService, c, null);
        } else {
            this.b = vjcVar;
            ((vjj) vjcVar).b = vjfVar;
        }
    }

    public final void a(boolean z, String str) {
        ((viz) this.u.get()).b(Boolean.valueOf(z), str);
    }

    public final void b(String str, String str2, boolean z) {
        ((viz) this.t.get()).b(str, str2, Boolean.valueOf(z));
    }

    public final void c(String str, String str2) {
        ((viz) this.v.get()).b(str, str2);
    }

    public final void d(String str) {
        ((viz) this.w.get()).b(str);
    }

    public final void e(String str) {
        ((viz) this.x.get()).b(str);
    }

    public final void f(boolean z) {
        vjj vjjVar = (vjj) this.b;
        vjjVar.e = z;
        if (z) {
            return;
        }
        vjjVar.b();
    }
}
