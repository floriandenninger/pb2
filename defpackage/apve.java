package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apve extends aonm implements aooz {
    public static final apve a;
    private static volatile aopf o;
    public int b;
    public apvi c;
    public apvj d;
    public apvl e;
    public apvg f;
    public apvh g;
    public apvf h;
    public apvk i;
    public apvq j;
    public apvm k;
    public apvn l;
    public apvo m;
    public apvp n;

    static {
        apve apveVar = new apve();
        a = apveVar;
        aonm.registerDefaultInstance(apve.class, apveVar);
    }

    private apve() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002U\f\u0000\u0000\u0000\u0002ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0014ဉ\u0003 ဉ\u0004)ဉ\u0005?ဉ\u0006@ဉ\u0007Mဉ\bSဉ\tTဉ\nUဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new apve();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (apve.class) {
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
