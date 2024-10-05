package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apfj extends aonm implements aooz {
    public static final apfj a;
    private static volatile aopf i;
    public int b;
    public boolean d;
    public boolean e;
    public apxf f;
    public apxf g;
    public apxf h;
    private byte j = 2;
    public String c = "";

    static {
        apfj apfjVar = new apfj();
        a = apfjVar;
        aonm.registerDefaultInstance(apfj.class, apfjVar);
    }

    private apfj() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001ဈ\u0000\u0002ဇ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ဇ\u0002", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apfj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (apfj.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
