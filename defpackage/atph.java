package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atph extends aonm implements aooz {
    private static volatile aopf I;
    public static final atph a;
    public long A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public boolean H;

    /* renamed from: J, reason: collision with root package name */
    private int f118J;
    private int K;
    private int L;
    public int b;
    public atqn c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        atph atphVar = new atph();
        a = atphVar;
        aonm.registerDefaultInstance(atph.class, atphVar);
    }

    private atph() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001 \u0000\u0004\u0004\ue3ce㸤 \u0000\u0000\u0000\u0004င\u0006\u0006ဇ\b\rဇ\u000f\u000eဇ\u0010\u0013ဇ\u0015\u0014ဇ\u0016\u0015င\u0017\u0016ဇ\u0018\u0017ဇ\u001a\u001aဇ\u001d\u001bင\u0019\u001dဇ\u001f\u001eဇ &ဇ'/ဇ0;ဇ;>ဇ>BဇBJဇHKဇINဇKOဇLPဇMUဂQVဇRYဇUZဇVeဇ`fဂakဇdoဇh\ue3ce㸤ဉ\u0000", new Object[]{"b", "J", "K", "L", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "l", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new atph();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = I;
                if (aopfVar == null) {
                    synchronized (atph.class) {
                        aopfVar = I;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            I = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
