package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awnh extends aonh implements aoni {
    public static final awnh a;
    private static volatile aopf q;
    public int b;
    public Object d;
    public int e;
    public int f;
    public float h;
    public int i;
    public int j;
    public boolean k;
    public awni m;
    public float n;
    public int o;
    public int p;
    public int c = 0;
    private byte r = 2;
    public String g = "";

    static {
        awnh awnhVar = new awnh();
        a = awnhVar;
        aonm.registerDefaultInstance(awnh.class, awnhVar);
    }

    private awnh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\u000e\r\u0000\u0000\u0001\u0001ဋ\u0000\u0002ဋ\u0001\u0004ခ\u0004\u0005ဋ\u0005\u0006ဌ\u0006\u0007ှ\u0000\bဿ\u0000\tဇ\t\nᐉ\n\u000bခ\u000b\fဌ\f\rဌ\r\u000eဈ\u0003", new Object[]{"d", "c", "b", "e", "f", "h", "i", "j", aweb.s, aweb.r, "k", "m", "n", "o", aweb.s, "p", aweb.q, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awnh();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (awnh.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
