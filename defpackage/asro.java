package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asro extends aonm implements aooz {
    public static final asro a;
    private static volatile aopf n;
    public int b;
    public aqyg d;
    public int e;
    public int f;
    public int g;
    public aqhu h;
    public avgg i;
    public int j;
    public int k;
    public apxf l;
    private aspl o;
    private aota p;
    private byte q = 2;
    public String c = "";
    public String m = "";

    static {
        asro asroVar = new asro();
        a = asroVar;
        aonm.registerDefaultInstance(asro.class, asroVar);
    }

    private asro() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\u0006\u0001ဈ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0006ဋ\u0004\u0007ဋ\u0005\bဋ\u0006\tᐉ\b\nဋ\t\u000bᐉ\u000b\fဈ\f\rဋ\n\u000eᐉ\r\u0010ᐉ\u0007", new Object[]{"b", "c", "d", "o", "e", "f", "g", "i", "j", "l", "m", "k", "p", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new asro();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (asro.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
