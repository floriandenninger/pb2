package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aryv extends aonm implements aooz {
    public static final aryv a;
    private static volatile aopf o;
    public int b;
    public long c;
    public aony f;
    public String g;
    public String h;
    public String i;
    public aony j;
    public String k;
    public String l;
    public float m;
    public String n;
    private byte p = 2;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();

    static {
        aryv aryvVar = new aryv();
        a = aryvVar;
        aonm.registerDefaultInstance(aryv.class, aryvVar);
    }

    private aryv() {
        emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = emptyProtobufList();
        this.k = "";
        this.l = "";
        this.n = "";
    }

    public final void a() {
        aony aonyVar = this.e;
        if (aonyVar.c()) {
            return;
        }
        this.e = aonm.mutableCopy(aonyVar);
    }

    public final void b() {
        aony aonyVar = this.d;
        if (aonyVar.c()) {
            return;
        }
        this.d = aonm.mutableCopy(aonyVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0004\u0003\u0001ဂ\u0000\u0002Л\u0003Л\u0004ဈ\u0001\u0005ဈ\u0002\u0007ဈ\u0004\b\u001b\u000bဈ\u0006\rခ\u0007\u000eဈ\u0005\u000fဈ\b\u0010Л", new Object[]{"b", "c", "d", aqxz.class, "e", aqxz.class, "g", "h", "i", "j", asnc.class, "l", "m", "k", "n", "f", atdz.class});
            case NEW_MUTABLE_INSTANCE:
                return new aryv();
            case NEW_BUILDER:
                return new aone((int[][][]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aryv.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
