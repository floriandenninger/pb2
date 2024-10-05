package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class askd extends aonh implements aoni {
    public static final askd a;
    public static final aonk b;
    private static volatile aopf o;
    public int c;
    public askb d;
    public asjz h;
    public boolean j;
    public aqrh k;
    public int m;
    private aota p;
    private byte q = 2;
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();
    public String g = "";
    public String i = "";
    public aomf n = aomf.b;

    static {
        askd askdVar = new askd();
        a = askdVar;
        aonm.registerDefaultInstance(askd.class, askdVar);
        b = aonm.newSingularGeneratedExtension(aulp.a, askdVar, askdVar, null, 50195462, aoqn.MESSAGE, askd.class);
    }

    private askd() {
    }

    public final void a() {
        aony aonyVar = this.e;
        if (aonyVar.c()) {
            return;
        }
        this.e = aonm.mutableCopy(aonyVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0002\u0004\u0001Л\u0002Л\u0003ᐉ\t\u0004ည\n\u0005ᐉ\u0000\u0006ဉ\u0002\u0007ဈ\u0003\bဇ\u0004\tဋ\u0006\nဉ\u0005\rဈ\u0001", new Object[]{"c", "e", askg.class, "f", askf.class, "p", "n", "d", "h", "i", "j", "m", "k", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new askd();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (askd.class) {
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

    public final void e() {
        aony aonyVar = this.f;
        if (aonyVar.c()) {
            return;
        }
        this.f = aonm.mutableCopy(aonyVar);
    }
}
