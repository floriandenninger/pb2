package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class babf extends aonm implements aooz {
    public static final babf a;
    private static volatile aopf ao;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public babe G;
    public long H;
    public babe I;

    /* renamed from: J, reason: collision with root package name */
    public babe f142J;
    public babe K;
    public babe L;
    public babe M;
    public babe N;
    public babe O;
    public babe P;
    public babe Q;
    public babe R;
    public babe S;
    public babe T;
    public babe U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    public long aa;
    public long ab;
    public long ac;
    public long ad;
    public long ae;
    public long af;
    public long ag;
    public long ah;
    public long ai;
    public long aj;
    public babe ak;
    public long al;
    public long am;
    public long an;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public babe n;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;
    public aony h = emptyProtobufList();
    public aony i = emptyProtobufList();
    public aony j = emptyProtobufList();
    public aony k = emptyProtobufList();
    public aony l = emptyProtobufList();
    public aony m = emptyProtobufList();
    public aony o = emptyProtobufList();
    public aony p = emptyProtobufList();
    public aony q = emptyProtobufList();
    public aony r = emptyProtobufList();

    static {
        babf babfVar = new babf();
        a = babfVar;
        aonm.registerDefaultInstance(babf.class, babfVar);
    }

    private babf() {
    }

    public final void a() {
        aony aonyVar = this.m;
        if (aonyVar.c()) {
            return;
        }
        this.m = aonm.mutableCopy(aonyVar);
    }

    public final void b() {
        aony aonyVar = this.o;
        if (aonyVar.c()) {
            return;
        }
        this.o = aonm.mutableCopy(aonyVar);
    }

    public final void c() {
        aony aonyVar = this.l;
        if (aonyVar.c()) {
            return;
        }
        this.l = aonm.mutableCopy(aonyVar);
    }

    public final void d() {
        aony aonyVar = this.k;
        if (aonyVar.c()) {
            return;
        }
        this.k = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001?\u0000\u0002\u0001@?\u0000\n\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000bဉ\u0004\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010ဂ\u0005\u0011ဂ\u0006\u0012ဂ\u0007\u0013ဂ\b\u0014ဂ\t\u0015ဂ\n\u0016ဂ\u000b\u0017ဂ\f\u0018ဂ\r\u0019ဂ\u000e\u001aဂ\u000f\u001bဂ\u0010\u001cဂ\u0011\u001dဂ\u0012\u001eဉ\u0013\u001fဂ\u0014 ဉ\u0015!ဉ\u0016\"ဉ\u0017#ဉ\u0018$ဉ\u0019%ဉ\u001a&ဉ\u001b'ဉ\u001c(ဉ\u001d)ဉ\u001e*ဉ\u001f+ဉ ,ဉ!-ဂ\".ဂ#/ဂ$0ဂ%1ဂ&2ဂ'3ဂ(4ဂ)5ဂ*6ဂ+7ဂ,8ဂ-9ဂ.:ဂ/;ဂ0=ဉ1>ဂ2?ဂ3@ဂ4", new Object[]{"b", "c", "d", "e", "f", "g", "h", babe.class, "i", babe.class, "j", babe.class, "k", babe.class, "l", babe.class, "m", babe.class, "n", "o", babe.class, "p", babb.class, "q", babc.class, "r", baba.class, "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an"});
            case NEW_MUTABLE_INSTANCE:
                return new babf();
            case NEW_BUILDER:
                return new aone((byte[][]) null, (float[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = ao;
                if (aopfVar == null) {
                    synchronized (babf.class) {
                        aopfVar = ao;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            ao = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void e() {
        aony aonyVar = this.h;
        if (aonyVar.c()) {
            return;
        }
        this.h = aonm.mutableCopy(aonyVar);
    }

    public final void f() {
        aony aonyVar = this.i;
        if (aonyVar.c()) {
            return;
        }
        this.i = aonm.mutableCopy(aonyVar);
    }

    public final void g() {
        aony aonyVar = this.j;
        if (aonyVar.c()) {
            return;
        }
        this.j = aonm.mutableCopy(aonyVar);
    }
}
