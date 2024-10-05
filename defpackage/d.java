package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class d {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "SIMPLE";
            case 3:
                return "CHOICE";
            case 4:
                return "PLURAL";
            case 5:
                return "SELECT";
            case 6:
                return "SELECTORDINAL";
            default:
                return "null";
        }
    }

    public static boolean b(int i) {
        return i == 4 || i == 6;
    }

    public static int c(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i = (i * 31) + str.charAt(i2);
        }
        return i;
    }

    public static boolean d(int i) {
        return i == 13 || i == 14;
    }

    public static cj e(Context context, ce ceVar, boolean z, boolean z2) {
        int qT;
        cb cbVar = ceVar.R;
        int i = 0;
        int i2 = cbVar == null ? 0 : cbVar.f;
        if (z2) {
            if (z) {
                qT = ceVar.qU();
            } else {
                qT = ceVar.qV();
            }
        } else if (z) {
            qT = ceVar.qS();
        } else {
            qT = ceVar.qT();
        }
        ceVar.ae(0, 0, 0, 0);
        ViewGroup viewGroup = ceVar.N;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            ceVar.N.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = ceVar.N;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (qT != 0) {
            i = qT;
        } else if (i2 != 0) {
            if (i2 == 4097) {
                i = true != z ? R.animator.fragment_open_exit : R.animator.fragment_open_enter;
            } else if (i2 == 8194) {
                i = true != z ? R.animator.fragment_close_exit : R.animator.fragment_close_enter;
            } else if (i2 != 8197) {
                if (i2 == 4099) {
                    i = true != z ? R.animator.fragment_fade_exit : R.animator.fragment_fade_enter;
                } else if (i2 != 4100) {
                    i = -1;
                } else if (z) {
                    i = i(context, android.R.attr.activityOpenEnterAnimation);
                } else {
                    i = i(context, android.R.attr.activityOpenExitAnimation);
                }
            } else if (z) {
                i = i(context, android.R.attr.activityCloseEnterAnimation);
            } else {
                i = i(context, android.R.attr.activityCloseExitAnimation);
            }
        }
        if (i != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
                    if (loadAnimation != null) {
                        return new cj(loadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                if (loadAnimator != null) {
                    return new cj(loadAnimator);
                }
            } catch (RuntimeException e2) {
                if (equals) {
                    throw e2;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                if (loadAnimation2 != null) {
                    return new cj(loadAnimation2);
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            default:
                return "CENTER_Y";
        }
    }

    private static int i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final aorg g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            aone a = aorg.a();
            a.U(2);
            return (aorg) a.build();
        }
        if (i2 == 1) {
            aone a2 = aorg.a();
            a2.U(2);
            return (aorg) a2.build();
        }
        if (i2 == 2) {
            aone a3 = aorg.a();
            a3.U(2);
            return (aorg) a3.build();
        }
        if (i2 != 3) {
            switch (i2) {
                case 100:
                    aone createBuilder = aorg.a.createBuilder();
                    createBuilder.U(3);
                    return (aorg) createBuilder.build();
                case 101:
                    aone createBuilder2 = aorg.a.createBuilder();
                    createBuilder2.U(3);
                    return (aorg) createBuilder2.build();
                case 102:
                    aone createBuilder3 = aorg.a.createBuilder();
                    createBuilder3.U(3);
                    return (aorg) createBuilder3.build();
                case 103:
                    aone createBuilder4 = aorg.a.createBuilder();
                    createBuilder4.U(3);
                    return (aorg) createBuilder4.build();
                case 104:
                    aone createBuilder5 = aorg.a.createBuilder();
                    createBuilder5.U(3);
                    return (aorg) createBuilder5.build();
                case 105:
                    aone createBuilder6 = aorg.a.createBuilder();
                    createBuilder6.U(3);
                    return (aorg) createBuilder6.build();
                case 106:
                    aone createBuilder7 = aorg.a.createBuilder();
                    createBuilder7.U(3);
                    return (aorg) createBuilder7.build();
                case 107:
                    aone a4 = aorg.a();
                    a4.U(2);
                    return (aorg) a4.build();
                case 108:
                    aone a5 = aorg.a();
                    a5.U(3);
                    return (aorg) a5.build();
                case 109:
                    aone a6 = aorg.a();
                    a6.U(3);
                    return (aorg) a6.build();
                case 110:
                    aone a7 = aorg.a();
                    a7.U(2);
                    return (aorg) a7.build();
                case 111:
                    aone a8 = aorg.a();
                    a8.U(3);
                    return (aorg) a8.build();
                case 112:
                    aone a9 = aorg.a();
                    a9.U(3);
                    return (aorg) a9.build();
                case 113:
                    aone a10 = aorg.a();
                    a10.U(3);
                    return (aorg) a10.build();
                case 114:
                    aone createBuilder8 = aorg.a.createBuilder();
                    createBuilder8.U(2);
                    return (aorg) createBuilder8.build();
                case 115:
                    aone a11 = aorg.a();
                    a11.U(3);
                    return (aorg) a11.build();
                case 116:
                    aone a12 = aorg.a();
                    a12.U(3);
                    return (aorg) a12.build();
                case 117:
                    aone createBuilder9 = aorg.a.createBuilder();
                    createBuilder9.U(3);
                    return (aorg) createBuilder9.build();
                case 118:
                    aone createBuilder10 = aorg.a.createBuilder();
                    createBuilder10.U(3);
                    return (aorg) createBuilder10.build();
                case 119:
                    aone createBuilder11 = aorg.a.createBuilder();
                    createBuilder11.U(3);
                    return (aorg) createBuilder11.build();
                case 120:
                    aone createBuilder12 = aorg.a.createBuilder();
                    createBuilder12.U(3);
                    return (aorg) createBuilder12.build();
                case 121:
                    aone createBuilder13 = aorg.a.createBuilder();
                    createBuilder13.U(3);
                    return (aorg) createBuilder13.build();
                case 122:
                    aone createBuilder14 = aorg.a.createBuilder();
                    createBuilder14.U(3);
                    return (aorg) createBuilder14.build();
                case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                    aone createBuilder15 = aorg.a.createBuilder();
                    createBuilder15.U(3);
                    return (aorg) createBuilder15.build();
                case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                    aone createBuilder16 = aorg.a.createBuilder();
                    createBuilder16.U(3);
                    return (aorg) createBuilder16.build();
                case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                    aone createBuilder17 = aorg.a.createBuilder();
                    createBuilder17.U(3);
                    return (aorg) createBuilder17.build();
                case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                    aone createBuilder18 = aorg.a.createBuilder();
                    createBuilder18.U(3);
                    return (aorg) createBuilder18.build();
                case 127:
                    aone createBuilder19 = aorg.a.createBuilder();
                    createBuilder19.U(3);
                    return (aorg) createBuilder19.build();
                case 128:
                    aone createBuilder20 = aorg.a.createBuilder();
                    createBuilder20.U(3);
                    return (aorg) createBuilder20.build();
                case 129:
                    aone createBuilder21 = aorg.a.createBuilder();
                    createBuilder21.U(3);
                    return (aorg) createBuilder21.build();
                case 130:
                    aone createBuilder22 = aorg.a.createBuilder();
                    createBuilder22.U(3);
                    return (aorg) createBuilder22.build();
                case 131:
                    aone createBuilder23 = aorg.a.createBuilder();
                    createBuilder23.U(3);
                    return (aorg) createBuilder23.build();
                case 132:
                    aone a13 = aorg.a();
                    a13.U(3);
                    return (aorg) a13.build();
                case 133:
                    aone a14 = aorg.a();
                    a14.U(3);
                    return (aorg) a14.build();
                case 134:
                    aone a15 = aorg.a();
                    a15.U(3);
                    return (aorg) a15.build();
                case 135:
                    aone a16 = aorg.a();
                    a16.U(2);
                    return (aorg) a16.build();
                case 136:
                    aone createBuilder24 = aorg.a.createBuilder();
                    createBuilder24.U(2);
                    return (aorg) createBuilder24.build();
                case 137:
                    aone createBuilder25 = aorg.a.createBuilder();
                    createBuilder25.U(2);
                    return (aorg) createBuilder25.build();
                case 138:
                    aone createBuilder26 = aorg.a.createBuilder();
                    createBuilder26.U(2);
                    return (aorg) createBuilder26.build();
                case 139:
                    aone createBuilder27 = aorg.a.createBuilder();
                    createBuilder27.U(2);
                    return (aorg) createBuilder27.build();
                case 140:
                    aone createBuilder28 = aorg.a.createBuilder();
                    createBuilder28.U(2);
                    return (aorg) createBuilder28.build();
                case 141:
                    aone createBuilder29 = aorg.a.createBuilder();
                    createBuilder29.U(2);
                    return (aorg) createBuilder29.build();
                case 142:
                    aone a17 = aorg.a();
                    a17.U(2);
                    return (aorg) a17.build();
                case 143:
                    aone a18 = aorg.a();
                    a18.U(2);
                    return (aorg) a18.build();
                case 144:
                    aone a19 = aorg.a();
                    a19.U(2);
                    return (aorg) a19.build();
                case 145:
                    aone a20 = aorg.a();
                    a20.U(2);
                    return (aorg) a20.build();
                case 146:
                    aone a21 = aorg.a();
                    a21.U(2);
                    return (aorg) a21.build();
                case 147:
                    aone a22 = aorg.a();
                    a22.U(2);
                    return (aorg) a22.build();
                case 148:
                    aone a23 = aorg.a();
                    a23.U(2);
                    return (aorg) a23.build();
                case 149:
                    aone createBuilder30 = aorg.a.createBuilder();
                    createBuilder30.U(2);
                    return (aorg) createBuilder30.build();
                case 150:
                    aone a24 = aorg.a();
                    a24.U(3);
                    return (aorg) a24.build();
                case 151:
                    aone a25 = aorg.a();
                    a25.U(3);
                    return (aorg) a25.build();
                case 152:
                    aone a26 = aorg.a();
                    a26.U(3);
                    return (aorg) a26.build();
                case 153:
                    aone a27 = aorg.a();
                    a27.U(3);
                    return (aorg) a27.build();
                case 154:
                    aone createBuilder31 = aorg.a.createBuilder();
                    createBuilder31.U(3);
                    return (aorg) createBuilder31.build();
                case 155:
                    aone a28 = aorg.a();
                    a28.U(3);
                    return (aorg) a28.build();
                case 156:
                    aone a29 = aorg.a();
                    a29.U(3);
                    return (aorg) a29.build();
                case 157:
                    aone createBuilder32 = aorg.a.createBuilder();
                    createBuilder32.U(23);
                    return (aorg) createBuilder32.build();
                case 158:
                    aone createBuilder33 = aorg.a.createBuilder();
                    createBuilder33.U(2);
                    return (aorg) createBuilder33.build();
                case 159:
                    aone a30 = aorg.a();
                    a30.U(2);
                    return (aorg) a30.build();
                case 160:
                    aone a31 = aorg.a();
                    a31.U(2);
                    return (aorg) a31.build();
                case 161:
                    aone createBuilder34 = aorg.a.createBuilder();
                    aone a32 = aore.a();
                    a32.P(2);
                    a32.P(16);
                    createBuilder34.S((aore) a32.build());
                    return (aorg) createBuilder34.build();
                case 162:
                    aone createBuilder35 = aorg.a.createBuilder();
                    aone createBuilder36 = aore.a.createBuilder();
                    createBuilder36.P(2);
                    createBuilder36.P(16);
                    createBuilder35.S((aore) createBuilder36.build());
                    return (aorg) createBuilder35.build();
                case 163:
                    aone createBuilder37 = aorg.a.createBuilder();
                    aone createBuilder38 = aore.a.createBuilder();
                    createBuilder38.P(2);
                    createBuilder38.P(16);
                    createBuilder37.S((aore) createBuilder38.build());
                    return (aorg) createBuilder37.build();
                case 164:
                    aone createBuilder39 = aorg.a.createBuilder();
                    aone createBuilder40 = aore.a.createBuilder();
                    createBuilder40.P(2);
                    createBuilder40.P(16);
                    createBuilder39.S((aore) createBuilder40.build());
                    return (aorg) createBuilder39.build();
                case 165:
                    aone createBuilder41 = aorg.a.createBuilder();
                    createBuilder41.U(2);
                    return (aorg) createBuilder41.build();
                case 166:
                    aone createBuilder42 = aorg.a.createBuilder();
                    createBuilder42.U(5);
                    return (aorg) createBuilder42.build();
                case 167:
                    aone a33 = aorg.a();
                    a33.U(2);
                    return (aorg) a33.build();
                case 168:
                    aone createBuilder43 = aorg.a.createBuilder();
                    createBuilder43.U(21);
                    return (aorg) createBuilder43.build();
                case 169:
                    aone createBuilder44 = aorg.a.createBuilder();
                    createBuilder44.U(21);
                    return (aorg) createBuilder44.build();
                case 170:
                    aone createBuilder45 = aorg.a.createBuilder();
                    createBuilder45.U(21);
                    return (aorg) createBuilder45.build();
                case 171:
                    aone createBuilder46 = aorg.a.createBuilder();
                    createBuilder46.U(21);
                    return (aorg) createBuilder46.build();
                case 172:
                    aone createBuilder47 = aorg.a.createBuilder();
                    createBuilder47.U(3);
                    return (aorg) createBuilder47.build();
                case 173:
                    aone createBuilder48 = aorg.a.createBuilder();
                    createBuilder48.U(3);
                    return (aorg) createBuilder48.build();
                case 174:
                    aone createBuilder49 = aorg.a.createBuilder();
                    createBuilder49.U(3);
                    return (aorg) createBuilder49.build();
                case 175:
                    aone createBuilder50 = aorg.a.createBuilder();
                    createBuilder50.U(3);
                    return (aorg) createBuilder50.build();
                case 176:
                    aone createBuilder51 = aorg.a.createBuilder();
                    createBuilder51.U(3);
                    return (aorg) createBuilder51.build();
                case 177:
                    aone createBuilder52 = aorg.a.createBuilder();
                    createBuilder52.U(15);
                    return (aorg) createBuilder52.build();
                case 178:
                    aone createBuilder53 = aorg.a.createBuilder();
                    createBuilder53.U(15);
                    return (aorg) createBuilder53.build();
                case 179:
                    aone createBuilder54 = aorg.a.createBuilder();
                    createBuilder54.U(15);
                    return (aorg) createBuilder54.build();
                case 180:
                    aone createBuilder55 = aorg.a.createBuilder();
                    createBuilder55.U(15);
                    return (aorg) createBuilder55.build();
                case 181:
                    aone createBuilder56 = aorg.a.createBuilder();
                    createBuilder56.U(21);
                    return (aorg) createBuilder56.build();
                case 182:
                    aone createBuilder57 = aorg.a.createBuilder();
                    createBuilder57.U(6);
                    return (aorg) createBuilder57.build();
                case 183:
                    aone createBuilder58 = aorg.a.createBuilder();
                    createBuilder58.U(8);
                    return (aorg) createBuilder58.build();
                case 184:
                    aone createBuilder59 = aorg.a.createBuilder();
                    createBuilder59.U(2);
                    return (aorg) createBuilder59.build();
                case 185:
                    aone createBuilder60 = aorg.a.createBuilder();
                    createBuilder60.U(9);
                    return (aorg) createBuilder60.build();
                case 186:
                    aone createBuilder61 = aorg.a.createBuilder();
                    aone createBuilder62 = aore.a.createBuilder();
                    createBuilder62.P(6);
                    createBuilder62.P(9);
                    aone a34 = aorf.a();
                    a34.R(10);
                    a34.R(11);
                    createBuilder62.O((aorf) a34.build());
                    createBuilder61.S((aore) createBuilder62.build());
                    return (aorg) createBuilder61.build();
                case 187:
                    aone createBuilder63 = aorg.a.createBuilder();
                    aone createBuilder64 = aorf.a.createBuilder();
                    createBuilder64.R(19);
                    aone a35 = aore.a();
                    a35.P(9);
                    a35.P(8);
                    createBuilder64.Q((aore) a35.build());
                    createBuilder63.T((aorf) createBuilder64.build());
                    return (aorg) createBuilder63.build();
                case 188:
                    aone createBuilder65 = aorg.a.createBuilder();
                    aone createBuilder66 = aorf.a.createBuilder();
                    createBuilder66.R(3);
                    createBuilder66.R(15);
                    createBuilder65.T((aorf) createBuilder66.build());
                    return (aorg) createBuilder65.build();
                case 189:
                    aone createBuilder67 = aorg.a.createBuilder();
                    aone createBuilder68 = aorf.a.createBuilder();
                    createBuilder68.R(3);
                    createBuilder68.R(15);
                    createBuilder67.T((aorf) createBuilder68.build());
                    return (aorg) createBuilder67.build();
                case 190:
                    aone createBuilder69 = aorg.a.createBuilder();
                    aone createBuilder70 = aorf.a.createBuilder();
                    createBuilder70.R(3);
                    createBuilder70.R(15);
                    createBuilder69.T((aorf) createBuilder70.build());
                    return (aorg) createBuilder69.build();
                case 191:
                    aone createBuilder71 = aorg.a.createBuilder();
                    aone createBuilder72 = aorf.a.createBuilder();
                    createBuilder72.R(3);
                    createBuilder72.R(15);
                    createBuilder71.T((aorf) createBuilder72.build());
                    return (aorg) createBuilder71.build();
                case 192:
                    aone createBuilder73 = aorg.a.createBuilder();
                    createBuilder73.copyOnWrite();
                    aorg aorgVar = (aorg) createBuilder73.instance;
                    aorgVar.c = 1;
                    aorgVar.b = 1;
                    return (aorg) createBuilder73.build();
                case 193:
                    aone createBuilder74 = aorg.a.createBuilder();
                    createBuilder74.copyOnWrite();
                    aorg aorgVar2 = (aorg) createBuilder74.instance;
                    aorgVar2.c = 1;
                    aorgVar2.b = 1;
                    return (aorg) createBuilder74.build();
                case 194:
                    aone a36 = aorg.a();
                    a36.U(2);
                    return (aorg) a36.build();
                case 195:
                    aone createBuilder75 = aorg.a.createBuilder();
                    createBuilder75.copyOnWrite();
                    aorg aorgVar3 = (aorg) createBuilder75.instance;
                    aorgVar3.c = 25;
                    aorgVar3.b = 1;
                    return (aorg) createBuilder75.build();
                case 196:
                    aone createBuilder76 = aorg.a.createBuilder();
                    createBuilder76.U(3);
                    return (aorg) createBuilder76.build();
                case 197:
                    aone a37 = aorg.a();
                    a37.U(13);
                    return (aorg) a37.build();
                default:
                    switch (i2) {
                        case 199:
                            aone createBuilder77 = aorg.a.createBuilder();
                            createBuilder77.U(2);
                            return (aorg) createBuilder77.build();
                        case 200:
                            aone createBuilder78 = aorg.a.createBuilder();
                            createBuilder78.U(2);
                            return (aorg) createBuilder78.build();
                        case 201:
                            aone createBuilder79 = aorg.a.createBuilder();
                            createBuilder79.U(2);
                            return (aorg) createBuilder79.build();
                        case 202:
                            aone createBuilder80 = aorg.a.createBuilder();
                            createBuilder80.U(2);
                            return (aorg) createBuilder80.build();
                        case 203:
                            aone a38 = aorg.a();
                            a38.U(2);
                            return (aorg) a38.build();
                        case 204:
                            aone createBuilder81 = aorg.a.createBuilder();
                            createBuilder81.copyOnWrite();
                            aorg aorgVar4 = (aorg) createBuilder81.instance;
                            aorgVar4.c = 13;
                            aorgVar4.b = 1;
                            return (aorg) createBuilder81.build();
                        case 205:
                            aone a39 = aorg.a();
                            a39.U(2);
                            return (aorg) a39.build();
                        case 206:
                            aone a40 = aorg.a();
                            a40.U(2);
                            return (aorg) a40.build();
                        case 207:
                            aone a41 = aorg.a();
                            a41.U(2);
                            return (aorg) a41.build();
                        case 208:
                            aone createBuilder82 = aorg.a.createBuilder();
                            createBuilder82.copyOnWrite();
                            aorg aorgVar5 = (aorg) createBuilder82.instance;
                            aorgVar5.c = 2;
                            aorgVar5.b = 1;
                            return (aorg) createBuilder82.build();
                        case 209:
                            aone createBuilder83 = aorg.a.createBuilder();
                            createBuilder83.copyOnWrite();
                            aorg aorgVar6 = (aorg) createBuilder83.instance;
                            aorgVar6.c = 1;
                            aorgVar6.b = 1;
                            return (aorg) createBuilder83.build();
                        case 210:
                            aone createBuilder84 = aorg.a.createBuilder();
                            aone createBuilder85 = aorf.a.createBuilder();
                            createBuilder85.R(25);
                            createBuilder85.R(24);
                            createBuilder84.T((aorf) createBuilder85.build());
                            return (aorg) createBuilder84.build();
                        case 211:
                            aone createBuilder86 = aorg.a.createBuilder();
                            aone createBuilder87 = aorf.a.createBuilder();
                            createBuilder87.R(25);
                            createBuilder87.R(24);
                            createBuilder86.T((aorf) createBuilder87.build());
                            return (aorg) createBuilder86.build();
                        case 212:
                            aone createBuilder88 = aorg.a.createBuilder();
                            aone createBuilder89 = aorf.a.createBuilder();
                            createBuilder89.R(25);
                            createBuilder89.R(24);
                            createBuilder88.T((aorf) createBuilder89.build());
                            return (aorg) createBuilder88.build();
                        case 213:
                            aone createBuilder90 = aorg.a.createBuilder();
                            createBuilder90.copyOnWrite();
                            aorg aorgVar7 = (aorg) createBuilder90.instance;
                            aorgVar7.c = 1;
                            aorgVar7.b = 1;
                            return (aorg) createBuilder90.build();
                        case 214:
                            aone createBuilder91 = aorg.a.createBuilder();
                            createBuilder91.copyOnWrite();
                            aorg aorgVar8 = (aorg) createBuilder91.instance;
                            aorgVar8.c = 1;
                            aorgVar8.b = 1;
                            return (aorg) createBuilder91.build();
                        case 215:
                            aone createBuilder92 = aorg.a.createBuilder();
                            createBuilder92.copyOnWrite();
                            aorg aorgVar9 = (aorg) createBuilder92.instance;
                            aorgVar9.c = 16;
                            aorgVar9.b = 1;
                            return (aorg) createBuilder92.build();
                        case 216:
                            aone createBuilder93 = aorg.a.createBuilder();
                            createBuilder93.copyOnWrite();
                            aorg aorgVar10 = (aorg) createBuilder93.instance;
                            aorgVar10.c = 1;
                            aorgVar10.b = 1;
                            return (aorg) createBuilder93.build();
                        case 217:
                            aone createBuilder94 = aorg.a.createBuilder();
                            createBuilder94.U(4);
                            return (aorg) createBuilder94.build();
                        case 218:
                            aone createBuilder95 = aorg.a.createBuilder();
                            createBuilder95.copyOnWrite();
                            aorg aorgVar11 = (aorg) createBuilder95.instance;
                            aorgVar11.c = 9;
                            aorgVar11.b = 1;
                            return (aorg) createBuilder95.build();
                        case 219:
                            aone createBuilder96 = aorg.a.createBuilder();
                            createBuilder96.U(2);
                            return (aorg) createBuilder96.build();
                        case 220:
                            aone createBuilder97 = aorg.a.createBuilder();
                            createBuilder97.U(2);
                            return (aorg) createBuilder97.build();
                        default:
                            switch (i2) {
                                case 222:
                                    aone createBuilder98 = aorg.a.createBuilder();
                                    createBuilder98.U(2);
                                    return (aorg) createBuilder98.build();
                                case 223:
                                    aone createBuilder99 = aorg.a.createBuilder();
                                    createBuilder99.copyOnWrite();
                                    aorg aorgVar12 = (aorg) createBuilder99.instance;
                                    aorgVar12.c = 0;
                                    aorgVar12.b = 1;
                                    return (aorg) createBuilder99.build();
                                case 224:
                                    aone createBuilder100 = aorg.a.createBuilder();
                                    createBuilder100.copyOnWrite();
                                    aorg aorgVar13 = (aorg) createBuilder100.instance;
                                    aorgVar13.c = 17;
                                    aorgVar13.b = 1;
                                    return (aorg) createBuilder100.build();
                                case 225:
                                    aone createBuilder101 = aorg.a.createBuilder();
                                    createBuilder101.copyOnWrite();
                                    aorg aorgVar14 = (aorg) createBuilder101.instance;
                                    aorgVar14.c = 17;
                                    aorgVar14.b = 1;
                                    return (aorg) createBuilder101.build();
                                case 226:
                                    aone createBuilder102 = aorg.a.createBuilder();
                                    createBuilder102.copyOnWrite();
                                    aorg aorgVar15 = (aorg) createBuilder102.instance;
                                    aorgVar15.c = 8;
                                    aorgVar15.b = 1;
                                    return (aorg) createBuilder102.build();
                                case 227:
                                    aone createBuilder103 = aorg.a.createBuilder();
                                    createBuilder103.copyOnWrite();
                                    aorg aorgVar16 = (aorg) createBuilder103.instance;
                                    aorgVar16.c = 17;
                                    aorgVar16.b = 1;
                                    return (aorg) createBuilder103.build();
                                case 228:
                                    aone createBuilder104 = aorg.a.createBuilder();
                                    createBuilder104.copyOnWrite();
                                    aorg aorgVar17 = (aorg) createBuilder104.instance;
                                    aorgVar17.c = 1;
                                    aorgVar17.b = 1;
                                    return (aorg) createBuilder104.build();
                                case 229:
                                    aone createBuilder105 = aorg.a.createBuilder();
                                    createBuilder105.copyOnWrite();
                                    aorg aorgVar18 = (aorg) createBuilder105.instance;
                                    aorgVar18.c = 1;
                                    aorgVar18.b = 1;
                                    return (aorg) createBuilder105.build();
                                case 230:
                                    aone createBuilder106 = aorg.a.createBuilder();
                                    createBuilder106.copyOnWrite();
                                    aorg aorgVar19 = (aorg) createBuilder106.instance;
                                    aorgVar19.c = 1;
                                    aorgVar19.b = 1;
                                    return (aorg) createBuilder106.build();
                                case 231:
                                    aone createBuilder107 = aorg.a.createBuilder();
                                    createBuilder107.copyOnWrite();
                                    aorg aorgVar20 = (aorg) createBuilder107.instance;
                                    aorgVar20.c = 1;
                                    aorgVar20.b = 1;
                                    return (aorg) createBuilder107.build();
                                case 232:
                                    aone createBuilder108 = aorg.a.createBuilder();
                                    createBuilder108.copyOnWrite();
                                    aorg aorgVar21 = (aorg) createBuilder108.instance;
                                    aorgVar21.c = 1;
                                    aorgVar21.b = 1;
                                    return (aorg) createBuilder108.build();
                                case 233:
                                    aone createBuilder109 = aorg.a.createBuilder();
                                    createBuilder109.copyOnWrite();
                                    aorg aorgVar22 = (aorg) createBuilder109.instance;
                                    aorgVar22.c = 19;
                                    aorgVar22.b = 1;
                                    return (aorg) createBuilder109.build();
                                case 234:
                                    aone createBuilder110 = aorg.a.createBuilder();
                                    createBuilder110.copyOnWrite();
                                    aorg aorgVar23 = (aorg) createBuilder110.instance;
                                    aorgVar23.c = 21;
                                    aorgVar23.b = 1;
                                    return (aorg) createBuilder110.build();
                                case 235:
                                    aone createBuilder111 = aorg.a.createBuilder();
                                    createBuilder111.copyOnWrite();
                                    aorg aorgVar24 = (aorg) createBuilder111.instance;
                                    aorgVar24.c = 21;
                                    aorgVar24.b = 1;
                                    return (aorg) createBuilder111.build();
                                case 236:
                                    aone createBuilder112 = aorg.a.createBuilder();
                                    createBuilder112.copyOnWrite();
                                    aorg aorgVar25 = (aorg) createBuilder112.instance;
                                    aorgVar25.c = 21;
                                    aorgVar25.b = 1;
                                    return (aorg) createBuilder112.build();
                                case 237:
                                    aone createBuilder113 = aorg.a.createBuilder();
                                    createBuilder113.U(21);
                                    return (aorg) createBuilder113.build();
                                case 238:
                                    aone createBuilder114 = aorg.a.createBuilder();
                                    createBuilder114.U(23);
                                    return (aorg) createBuilder114.build();
                                case 239:
                                    aone createBuilder115 = aorg.a.createBuilder();
                                    createBuilder115.U(4);
                                    return (aorg) createBuilder115.build();
                                case 240:
                                    aone createBuilder116 = aorg.a.createBuilder();
                                    createBuilder116.copyOnWrite();
                                    aorg aorgVar26 = (aorg) createBuilder116.instance;
                                    aorgVar26.c = 1;
                                    aorgVar26.b = 1;
                                    return (aorg) createBuilder116.build();
                                case 241:
                                    aone createBuilder117 = aorg.a.createBuilder();
                                    createBuilder117.U(2);
                                    return (aorg) createBuilder117.build();
                                case 242:
                                    aone createBuilder118 = aorg.a.createBuilder();
                                    createBuilder118.copyOnWrite();
                                    aorg aorgVar27 = (aorg) createBuilder118.instance;
                                    aorgVar27.c = 1;
                                    aorgVar27.b = 1;
                                    return (aorg) createBuilder118.build();
                                case 243:
                                    aone createBuilder119 = aorg.a.createBuilder();
                                    createBuilder119.copyOnWrite();
                                    aorg aorgVar28 = (aorg) createBuilder119.instance;
                                    aorgVar28.c = 1;
                                    aorgVar28.b = 1;
                                    return (aorg) createBuilder119.build();
                                case 244:
                                    aone createBuilder120 = aorg.a.createBuilder();
                                    createBuilder120.copyOnWrite();
                                    aorg aorgVar29 = (aorg) createBuilder120.instance;
                                    aorgVar29.c = 26;
                                    aorgVar29.b = 1;
                                    return (aorg) createBuilder120.build();
                                case 245:
                                    aone createBuilder121 = aorg.a.createBuilder();
                                    createBuilder121.copyOnWrite();
                                    aorg aorgVar30 = (aorg) createBuilder121.instance;
                                    aorgVar30.c = 1;
                                    aorgVar30.b = 1;
                                    return (aorg) createBuilder121.build();
                                case 246:
                                    aone createBuilder122 = aorg.a.createBuilder();
                                    createBuilder122.copyOnWrite();
                                    aorg aorgVar31 = (aorg) createBuilder122.instance;
                                    aorgVar31.c = 1;
                                    aorgVar31.b = 1;
                                    return (aorg) createBuilder122.build();
                                case 247:
                                    aone createBuilder123 = aorg.a.createBuilder();
                                    createBuilder123.copyOnWrite();
                                    aorg aorgVar32 = (aorg) createBuilder123.instance;
                                    aorgVar32.c = 1;
                                    aorgVar32.b = 1;
                                    return (aorg) createBuilder123.build();
                                default:
                                    switch (i2) {
                                        case 250:
                                            aone createBuilder124 = aorg.a.createBuilder();
                                            createBuilder124.copyOnWrite();
                                            aorg aorgVar33 = (aorg) createBuilder124.instance;
                                            aorgVar33.c = 1;
                                            aorgVar33.b = 1;
                                            return (aorg) createBuilder124.build();
                                        case 251:
                                            aone createBuilder125 = aorg.a.createBuilder();
                                            createBuilder125.copyOnWrite();
                                            aorg aorgVar34 = (aorg) createBuilder125.instance;
                                            aorgVar34.c = 1;
                                            aorgVar34.b = 1;
                                            return (aorg) createBuilder125.build();
                                        case 252:
                                            aone createBuilder126 = aorg.a.createBuilder();
                                            createBuilder126.copyOnWrite();
                                            aorg aorgVar35 = (aorg) createBuilder126.instance;
                                            aorgVar35.c = 3;
                                            aorgVar35.b = 1;
                                            return (aorg) createBuilder126.build();
                                        case 253:
                                            aone createBuilder127 = aorg.a.createBuilder();
                                            createBuilder127.copyOnWrite();
                                            aorg aorgVar36 = (aorg) createBuilder127.instance;
                                            aorgVar36.c = 3;
                                            aorgVar36.b = 1;
                                            return (aorg) createBuilder127.build();
                                        case 254:
                                            aone createBuilder128 = aorg.a.createBuilder();
                                            createBuilder128.copyOnWrite();
                                            aorg aorgVar37 = (aorg) createBuilder128.instance;
                                            aorgVar37.c = 3;
                                            aorgVar37.b = 1;
                                            return (aorg) createBuilder128.build();
                                        default:
                                            aone a42 = aorg.a();
                                            a42.U(1);
                                            return (aorg) a42.build();
                                    }
                            }
                    }
            }
        }
        aone a43 = aorg.a();
        a43.U(1);
        return (aorg) a43.build();
    }
}
