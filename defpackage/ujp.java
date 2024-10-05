package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ujp {
    public final vje a;
    public final amnv b;
    public final amnv c;
    public final amnv d;
    public final amnv e;
    public final amnv f;
    private final vjc g;

    public ujp(ScheduledExecutorService scheduledExecutorService, vjf vjfVar, Application application) {
        final int i = 1;
        amkq.x(new amnv(this) { // from class: ujo
            public final /* synthetic */ ujp a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/og_android/lazy_provider_count", viy.c("app_package"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/og_android/invalid_user_profile_switch", viy.c("app_package"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/og_android/switch_profile", viy.c("result"), viy.a("has_category_launcher"), viy.a("has_category_info"), viy.a("user_in_target_user_profiles"), viy.b("api_version"), viy.c("app_package"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", viy.c("app_package"), viy.a("ve_enabled"), viy.a("ve_provided"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/og_android/load_owners_count", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/og_android/load_owner_count", viy.c("implementation"), viy.c("result"), viy.c("app_package"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", viy.c("app_package"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        e8.c();
                        return e8;
                    case 8:
                        viw b = this.a.a.b("/client_streamz/og_android/load_owners_latency", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        b.c();
                        return b;
                    case 9:
                        viw b2 = this.a.a.b("/client_streamz/og_android/load_owner_avatar_latency", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        b2.c();
                        return b2;
                    default:
                        viz e9 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", viy.c("result"), viy.c("app_package"));
                        e9.c();
                        return e9;
                }
            }
        });
        final int i2 = 2;
        amkq.x(new amnv(this) { // from class: ujo
            public final /* synthetic */ ujp a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i2) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/og_android/lazy_provider_count", viy.c("app_package"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/og_android/invalid_user_profile_switch", viy.c("app_package"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/og_android/switch_profile", viy.c("result"), viy.a("has_category_launcher"), viy.a("has_category_info"), viy.a("user_in_target_user_profiles"), viy.b("api_version"), viy.c("app_package"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", viy.c("app_package"), viy.a("ve_enabled"), viy.a("ve_provided"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/og_android/load_owners_count", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/og_android/load_owner_count", viy.c("implementation"), viy.c("result"), viy.c("app_package"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", viy.c("app_package"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        e8.c();
                        return e8;
                    case 8:
                        viw b = this.a.a.b("/client_streamz/og_android/load_owners_latency", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        b.c();
                        return b;
                    case 9:
                        viw b2 = this.a.a.b("/client_streamz/og_android/load_owner_avatar_latency", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        b2.c();
                        return b2;
                    default:
                        viz e9 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", viy.c("result"), viy.c("app_package"));
                        e9.c();
                        return e9;
                }
            }
        });
        final int i3 = 4;
        this.b = amkq.x(new amnv(this) { // from class: ujo
            public final /* synthetic */ ujp a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i3) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/og_android/lazy_provider_count", viy.c("app_package"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/og_android/invalid_user_profile_switch", viy.c("app_package"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/og_android/switch_profile", viy.c("result"), viy.a("has_category_launcher"), viy.a("has_category_info"), viy.a("user_in_target_user_profiles"), viy.b("api_version"), viy.c("app_package"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", viy.c("app_package"), viy.a("ve_enabled"), viy.a("ve_provided"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/og_android/load_owners_count", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/og_android/load_owner_count", viy.c("implementation"), viy.c("result"), viy.c("app_package"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", viy.c("app_package"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        e8.c();
                        return e8;
                    case 8:
                        viw b = this.a.a.b("/client_streamz/og_android/load_owners_latency", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        b.c();
                        return b;
                    case 9:
                        viw b2 = this.a.a.b("/client_streamz/og_android/load_owner_avatar_latency", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        b2.c();
                        return b2;
                    default:
                        viz e9 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", viy.c("result"), viy.c("app_package"));
                        e9.c();
                        return e9;
                }
            }
        });
        final int i4 = 5;
        amkq.x(new amnv(this) { // from class: ujo
            public final /* synthetic */ ujp a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i4) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/og_android/lazy_provider_count", viy.c("app_package"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/og_android/invalid_user_profile_switch", viy.c("app_package"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/og_android/switch_profile", viy.c("result"), viy.a("has_category_launcher"), viy.a("has_category_info"), viy.a("user_in_target_user_profiles"), viy.b("api_version"), viy.c("app_package"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", viy.c("app_package"), viy.a("ve_enabled"), viy.a("ve_provided"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/og_android/load_owners_count", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/og_android/load_owner_count", viy.c("implementation"), viy.c("result"), viy.c("app_package"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", viy.c("app_package"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        e8.c();
                        return e8;
                    case 8:
                        viw b = this.a.a.b("/client_streamz/og_android/load_owners_latency", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        b.c();
                        return b;
                    case 9:
                        viw b2 = this.a.a.b("/client_streamz/og_android/load_owner_avatar_latency", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        b2.c();
                        return b2;
                    default:
                        viz e9 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", viy.c("result"), viy.c("app_package"));
                        e9.c();
                        return e9;
                }
            }
        });
        final int i5 = 6;
        amkq.x(new amnv(this) { // from class: ujo
            public final /* synthetic */ ujp a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i5) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/og_android/lazy_provider_count", viy.c("app_package"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/og_android/invalid_user_profile_switch", viy.c("app_package"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/og_android/switch_profile", viy.c("result"), viy.a("has_category_launcher"), viy.a("has_category_info"), viy.a("user_in_target_user_profiles"), viy.b("api_version"), viy.c("app_package"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", viy.c("app_package"), viy.a("ve_enabled"), viy.a("ve_provided"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/og_android/load_owners_count", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/og_android/load_owner_count", viy.c("implementation"), viy.c("result"), viy.c("app_package"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", viy.c("app_package"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        e8.c();
                        return e8;
                    case 8:
                        viw b = this.a.a.b("/client_streamz/og_android/load_owners_latency", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        b.c();
                        return b;
                    case 9:
                        viw b2 = this.a.a.b("/client_streamz/og_android/load_owner_avatar_latency", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        b2.c();
                        return b2;
                    default:
                        viz e9 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", viy.c("result"), viy.c("app_package"));
                        e9.c();
                        return e9;
                }
            }
        });
        final int i6 = 7;
        this.c = amkq.x(new amnv(this) { // from class: ujo
            public final /* synthetic */ ujp a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i6) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/og_android/lazy_provider_count", viy.c("app_package"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/og_android/invalid_user_profile_switch", viy.c("app_package"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/og_android/switch_profile", viy.c("result"), viy.a("has_category_launcher"), viy.a("has_category_info"), viy.a("user_in_target_user_profiles"), viy.b("api_version"), viy.c("app_package"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", viy.c("app_package"), viy.a("ve_enabled"), viy.a("ve_provided"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/og_android/load_owners_count", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/og_android/load_owner_count", viy.c("implementation"), viy.c("result"), viy.c("app_package"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", viy.c("app_package"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        e8.c();
                        return e8;
                    case 8:
                        viw b = this.a.a.b("/client_streamz/og_android/load_owners_latency", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        b.c();
                        return b;
                    case 9:
                        viw b2 = this.a.a.b("/client_streamz/og_android/load_owner_avatar_latency", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        b2.c();
                        return b2;
                    default:
                        viz e9 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", viy.c("result"), viy.c("app_package"));
                        e9.c();
                        return e9;
                }
            }
        });
        final int i7 = 8;
        this.d = amkq.x(new amnv(this) { // from class: ujo
            public final /* synthetic */ ujp a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i7) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/og_android/lazy_provider_count", viy.c("app_package"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/og_android/invalid_user_profile_switch", viy.c("app_package"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/og_android/switch_profile", viy.c("result"), viy.a("has_category_launcher"), viy.a("has_category_info"), viy.a("user_in_target_user_profiles"), viy.b("api_version"), viy.c("app_package"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", viy.c("app_package"), viy.a("ve_enabled"), viy.a("ve_provided"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/og_android/load_owners_count", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/og_android/load_owner_count", viy.c("implementation"), viy.c("result"), viy.c("app_package"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", viy.c("app_package"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        e8.c();
                        return e8;
                    case 8:
                        viw b = this.a.a.b("/client_streamz/og_android/load_owners_latency", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        b.c();
                        return b;
                    case 9:
                        viw b2 = this.a.a.b("/client_streamz/og_android/load_owner_avatar_latency", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        b2.c();
                        return b2;
                    default:
                        viz e9 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", viy.c("result"), viy.c("app_package"));
                        e9.c();
                        return e9;
                }
            }
        });
        final int i8 = 9;
        this.e = amkq.x(new amnv(this) { // from class: ujo
            public final /* synthetic */ ujp a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i8) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/og_android/lazy_provider_count", viy.c("app_package"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/og_android/invalid_user_profile_switch", viy.c("app_package"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/og_android/switch_profile", viy.c("result"), viy.a("has_category_launcher"), viy.a("has_category_info"), viy.a("user_in_target_user_profiles"), viy.b("api_version"), viy.c("app_package"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", viy.c("app_package"), viy.a("ve_enabled"), viy.a("ve_provided"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/og_android/load_owners_count", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/og_android/load_owner_count", viy.c("implementation"), viy.c("result"), viy.c("app_package"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", viy.c("app_package"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        e8.c();
                        return e8;
                    case 8:
                        viw b = this.a.a.b("/client_streamz/og_android/load_owners_latency", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        b.c();
                        return b;
                    case 9:
                        viw b2 = this.a.a.b("/client_streamz/og_android/load_owner_avatar_latency", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        b2.c();
                        return b2;
                    default:
                        viz e9 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", viy.c("result"), viy.c("app_package"));
                        e9.c();
                        return e9;
                }
            }
        });
        final int i9 = 10;
        this.f = amkq.x(new amnv(this) { // from class: ujo
            public final /* synthetic */ ujp a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i9) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/og_android/lazy_provider_count", viy.c("app_package"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/og_android/invalid_user_profile_switch", viy.c("app_package"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/og_android/switch_profile", viy.c("result"), viy.a("has_category_launcher"), viy.a("has_category_info"), viy.a("user_in_target_user_profiles"), viy.b("api_version"), viy.c("app_package"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", viy.c("app_package"), viy.a("ve_enabled"), viy.a("ve_provided"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/og_android/load_owners_count", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/og_android/load_owner_count", viy.c("implementation"), viy.c("result"), viy.c("app_package"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", viy.c("app_package"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        e8.c();
                        return e8;
                    case 8:
                        viw b = this.a.a.b("/client_streamz/og_android/load_owners_latency", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        b.c();
                        return b;
                    case 9:
                        viw b2 = this.a.a.b("/client_streamz/og_android/load_owner_avatar_latency", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        b2.c();
                        return b2;
                    default:
                        viz e9 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", viy.c("result"), viy.c("app_package"));
                        e9.c();
                        return e9;
                }
            }
        });
        final int i10 = 0;
        amkq.x(new amnv(this) { // from class: ujo
            public final /* synthetic */ ujp a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i10) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/og_android/lazy_provider_count", viy.c("app_package"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/og_android/invalid_user_profile_switch", viy.c("app_package"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/og_android/switch_profile", viy.c("result"), viy.a("has_category_launcher"), viy.a("has_category_info"), viy.a("user_in_target_user_profiles"), viy.b("api_version"), viy.c("app_package"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", viy.c("app_package"), viy.a("ve_enabled"), viy.a("ve_provided"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/og_android/load_owners_count", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/og_android/load_owner_count", viy.c("implementation"), viy.c("result"), viy.c("app_package"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", viy.c("app_package"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        e8.c();
                        return e8;
                    case 8:
                        viw b = this.a.a.b("/client_streamz/og_android/load_owners_latency", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        b.c();
                        return b;
                    case 9:
                        viw b2 = this.a.a.b("/client_streamz/og_android/load_owner_avatar_latency", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        b2.c();
                        return b2;
                    default:
                        viz e9 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", viy.c("result"), viy.c("app_package"));
                        e9.c();
                        return e9;
                }
            }
        });
        final int i11 = 3;
        amkq.x(new amnv(this) { // from class: ujo
            public final /* synthetic */ ujp a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                switch (i11) {
                    case 0:
                        viz e = this.a.a.e("/client_streamz/og_android/lazy_provider_count", viy.c("app_package"));
                        e.c();
                        return e;
                    case 1:
                        viz e2 = this.a.a.e("/client_streamz/og_android/invalid_user_profile_switch", viy.c("app_package"));
                        e2.c();
                        return e2;
                    case 2:
                        viz e3 = this.a.a.e("/client_streamz/og_android/switch_profile", viy.c("result"), viy.a("has_category_launcher"), viy.a("has_category_info"), viy.a("user_in_target_user_profiles"), viy.b("api_version"), viy.c("app_package"));
                        e3.c();
                        return e3;
                    case 3:
                        viz e4 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", viy.c("app_package"), viy.a("ve_enabled"), viy.a("ve_provided"));
                        e4.c();
                        return e4;
                    case 4:
                        viz e5 = this.a.a.e("/client_streamz/og_android/load_owners_count", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        e5.c();
                        return e5;
                    case 5:
                        viz e6 = this.a.a.e("/client_streamz/og_android/load_owner_count", viy.c("implementation"), viy.c("result"), viy.c("app_package"));
                        e6.c();
                        return e6;
                    case 6:
                        viz e7 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", viy.c("app_package"));
                        e7.c();
                        return e7;
                    case 7:
                        viz e8 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        e8.c();
                        return e8;
                    case 8:
                        viw b = this.a.a.b("/client_streamz/og_android/load_owners_latency", viy.c("implementation"), viy.c("result"), viy.b("number_of_owners"), viy.c("app_package"), viy.a("load_cached"));
                        b.c();
                        return b;
                    case 9:
                        viw b2 = this.a.a.b("/client_streamz/og_android/load_owner_avatar_latency", viy.c("implementation"), viy.c("avatar_size"), viy.c("result"), viy.c("app_package"), viy.a("load_cached"));
                        b2.c();
                        return b2;
                    default:
                        viz e9 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", viy.c("result"), viy.c("app_package"));
                        e9.c();
                        return e9;
                }
            }
        });
        vje c = vje.c("STREAMZ_ONEGOOGLE_ANDROID");
        this.a = c;
        vjc vjcVar = c.a;
        if (vjcVar == null) {
            this.g = vjj.a(vjfVar, scheduledExecutorService, c, application);
        } else {
            this.g = vjcVar;
            ((vjj) vjcVar).b = vjfVar;
        }
    }
}
