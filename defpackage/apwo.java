package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwo extends aonm implements aooz {
    public static final apwo a;
    private static volatile aopf h;
    public int b;
    public int c;
    public long e;
    public long f;
    public apxf g;
    private byte i = 2;
    public String d = "";

    static {
        apwo apwoVar = new apwo();
        a = apwoVar;
        aonm.registerDefaultInstance(apwo.class, apwoVar);
    }

    private apwo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0001\u0002ဂ\u0002\u0003ဂ\u0003\u0004ᐉ\u0004\u0005ဌ\u0000", new Object[]{"b", "d", "e", "f", "g", "c", assi.q});
            case NEW_MUTABLE_INSTANCE:
                return new apwo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (apwo.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
